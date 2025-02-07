package service;

public abstract class OperatorStore extends Store{

    protected OperatorStore() {
        createProducts();
    }

    protected abstract void createProducts();
}
