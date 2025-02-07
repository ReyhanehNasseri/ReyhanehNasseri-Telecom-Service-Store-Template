package model;

import java.util.Date;

public class Charge extends Product {

    public Charge(int price, Date joinDate, OperatorName operatorName) {
        super(price, joinDate, operatorName);
    }

    @Override
    protected double getAffordability() {
        return (double) this.getPrice() / 2;
    }

}
