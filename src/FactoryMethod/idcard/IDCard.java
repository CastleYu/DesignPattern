package FactoryMethod.idcard;

import FactoryMethod.framework.Product;

public class IDCard extends Product {
    private final String owner;
    IDCard(String owner) {
        System.out.println("����" + owner + "�Ŀ���");
        this.owner = owner;
    }
    public void use () {
        System.out.println("ʹ��" + owner + "�Ŀ���");
    }
    public String getOwner() {
        return owner;
    }
}

