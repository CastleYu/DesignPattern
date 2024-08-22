package Prototype.framework;

import java.util.Hashtable;

public class Manager {
    private final Hashtable showcase = new Hashtable();
    //�������ƺͶ���ʵ����Ĺ�ϵ
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    public Product create(String protoname) {
        //ȡ������ʵ��
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}