package absFactory;

public interface Factory {
}

class FactoryA implements Factory {
    public Environment createEnvironment() {
        return new EnvironmentA();
    }

    public Product createProduct() {
        return new ProductA();
    }
}

class FactoryB implements Factory {
    public Environment createEnvironment() {
        return new EnvironmentB();
    }

    public Product createProduct() {
        return new ProductB();
    }

}