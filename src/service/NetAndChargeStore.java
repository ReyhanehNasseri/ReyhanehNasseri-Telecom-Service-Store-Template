package service;
import model.Charge;
import model.InternetPackage;
import model.OperatorName;
import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class NetAndChargeStore extends Store {

    ChargeStorage chargeStorage;
    InternetPackageStorage internetPackageStorage;
    CustomerStorage customerStorage;

    public NetAndChargeStore(){
        chargeStorage = new ChargeStorage();
        internetPackageStorage = new InternetPackageStorage();
        customerStorage = new CustomerStorage();
    }

    public void fillWithOperatorStores(OperatorStore mci , OperatorStore irancell){
        products.addAll(mci.getProducts());
        products.addAll(irancell.getProducts());
        fillTheStorages(mci , irancell);
    }

    private void fillTheStorages(OperatorStore mci , OperatorStore irancell){
        Runnable worker1task= () -> {
            List<InternetPackage> mciInternetProducts = new ArrayList<>();
            List<Charge> mciChargeProducts = new ArrayList<>();
            mciInternetProducts = mci.getInternetPackages();
            mciChargeProducts = mci.getCharges();

            internetPackageStorage.addContent(mciInternetProducts);
            chargeStorage.addContent(mciChargeProducts);
            customerStorage.addContent(mciChargeProducts);
            customerStorage.addContent(mciInternetProducts);
        };

        Runnable worker2task = () -> {
            List<InternetPackage> irancellInternetProducts = new ArrayList<>();
            List<Charge> irancellChargeProducts = new ArrayList<>();
            irancellInternetProducts = irancell.getInternetPackages();
            irancellChargeProducts = irancell.getCharges();

            internetPackageStorage.addContent(irancellInternetProducts);
            chargeStorage.addContent(irancellChargeProducts);
            customerStorage.addContent(irancellChargeProducts);
            customerStorage.addContent(irancellInternetProducts);
        };

        Thread worker1 = new Thread(worker1task);
        Thread worker2 = new Thread(worker2task);

        worker1.start();
        worker2.start();
        try{
            worker1.join();
            worker2.join();
        } catch (InterruptedException error){
            error.printStackTrace();
        }
    }

    public Product getBestOffer(){
        Collections.sort(products);
        return products.get(0);
    }

    public int getCustomerStorageCount(){
        return customerStorage.getContentsCount();
    }

    public int getInternetPackageStorageCount(){
        return internetPackageStorage.getContentsCount();
    }

    public int getChargeStorageCount(){
        return chargeStorage.getContentsCount();
    }

}