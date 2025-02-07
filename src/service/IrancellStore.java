package service;

import model.InternetPackage;
import model.OperatorName;
import model.TimePeriod;
import model.Charge;

import java.util.Date;

public class IrancellStore extends OperatorStore {


    @Override
    protected void createProducts() {
        InternetPackage internetPackage1 = new InternetPackage(OperatorName.IRANCELL , 5000 , 5 , TimePeriod.DAILY, new Date());
        InternetPackage internetPackage2 = new InternetPackage(OperatorName.IRANCELL , 10000 , 10 , TimePeriod.DAILY, new Date());
        InternetPackage internetPackage3 = new InternetPackage(OperatorName.IRANCELL , 7000 , 5 , TimePeriod.TWODAYS, new Date());
        InternetPackage internetPackage4 = new InternetPackage(OperatorName.IRANCELL , 8000 , 10 , TimePeriod.TWODAYS, new Date());
        InternetPackage internetPackage5 = new InternetPackage(OperatorName.IRANCELL , 45000 , 15 , TimePeriod.WEEKLY, new Date());
        InternetPackage internetPackage6 = new InternetPackage(OperatorName.IRANCELL , 54000 , 20 , TimePeriod.WEEKLY, new Date());
        Charge charge1 = new Charge(5000 , new Date() , OperatorName.IRANCELL);
        Charge charge2 = new Charge(10000 , new Date() , OperatorName.IRANCELL);
        Charge charge3= new Charge(15000 , new Date() , OperatorName.IRANCELL);
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

}
