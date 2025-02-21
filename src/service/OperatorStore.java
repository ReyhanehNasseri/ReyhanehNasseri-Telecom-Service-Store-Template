package service;

import model.Charge;
import model.InternetPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class OperatorStore extends Store{

    protected OperatorStore() {
        createProducts();
    }

    protected abstract void createProducts();

    public List<InternetPackage> getInternetPackages() {
        return new ArrayList<>();
    }

    public List<Charge> getCharges() {
        return new ArrayList<>();
    }


}
