package model;

import java.util.Date;

public class InternetPackage extends Product {
    private final TimePeriod timePeriod;
    private final int value;

    public InternetPackage(OperatorName operator, int price , int value , TimePeriod timePeriod , Date joindate){
        super(price, joindate, operator);
        this.value = value;
        this.timePeriod = timePeriod;
    }


    @Override
    protected double getAffordability() {
        return ((double) getPrice()/timePeriod.getValue()) * value * 0.5;
    }
}
