package service;
import model.OperatorName;
import model.Product;
import java.util.Collections;
import java.util.List;


public class NetAndChargeStore extends Store {

    public void fillWithOperatorStores(OperatorStore mci , OperatorStore irancell){
        products.addAll(mci.getProducts());
        products.addAll(irancell.getProducts());
    }

    public Product getBestOffer(){
        Collections.sort(products);
        return products.get(0);
    }

}