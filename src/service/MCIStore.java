package service;

import model.*;

import java.util.Date;
import java.util.List;

public class MCIStore extends OperatorStore {


    @Override
    protected void createProducts() {
        InternetPackage internetPackage1 = new InternetPackage(OperatorName.MCI , 5000 , 5 , TimePeriod.DAILY, new Date());
        InternetPackage internetPackage2 = new InternetPackage(OperatorName.MCI , 10000 , 10 , TimePeriod.DAILY, new Date());
        InternetPackage internetPackage3 = new InternetPackage(OperatorName.MCI , 7000 , 5 , TimePeriod.TWODAYS, new Date());
        InternetPackage internetPackage4 = new InternetPackage(OperatorName.MCI , 8000 , 10 , TimePeriod.TWODAYS, new Date());
        InternetPackage internetPackage5 = new InternetPackage(OperatorName.MCI , 45000 , 15 , TimePeriod.WEEKLY, new Date());
        InternetPackage internetPackage6 = new InternetPackage(OperatorName.MCI , 54000 , 20 , TimePeriod.WEEKLY, new Date());
        Charge charge1 = new Charge(5000 , new Date() , OperatorName.MCI);
        Charge charge2 = new Charge(10000 , new Date() , OperatorName.MCI);
        Charge charge3= new Charge(15000 , new Date() , OperatorName.MCI);

        this.addProduct(internetPackage1);
        this.addProduct(internetPackage2);
        this.addProduct(internetPackage3);
        this.addProduct(internetPackage4);
        this.addProduct(internetPackage5);
        this.addProduct(internetPackage6);
        this.addProduct(charge1);
        this.addProduct(charge2);
        this.addProduct(charge3);

    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}
