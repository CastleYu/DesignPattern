package FactoryMethod.idcard;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;

import java.util.Vector;

public class IDCardFactory extends Factory {
    private final Vector owners = new Vector();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public Vector getOwners() {
        return owners;
    }
}
