package model;

import java.util.Date;


public abstract class Product implements Comparable<Product>{

    private int price;
    private Date joinDate;
    private OperatorName operatorName;

    protected Product(int price, Date joinDate, OperatorName operatorName) {
        this.price = price;
        this.joinDate = joinDate;
        this.operatorName = operatorName;
    }

    protected abstract double getAffordability();

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.getAffordability(), other.getAffordability());
    }

    public int getPrice() {
        return price;
    }
    public Date getJoinDate() {
        return joinDate;
    }
    public OperatorName getOperatorName() {
        return operatorName;
    }

}