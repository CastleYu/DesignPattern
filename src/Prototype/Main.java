package Prototype;

import framework.*;

public class Main {
    public static void main(String[] args) {
        // Ԥ���׶�
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // ʵ�ֲ���
        //���ʣ�P1��P2��P3��P4��P5��P6����ʲô�����������ģ�
        Product p1 = manager.create("strong message");      
        p1.use("Hello, world.");
        Product p2 = manager.create("strong message");
        p2.use("Hello, XMU.");
        Product p3 = manager.create("strong message");
        p3.use("Hello, Software School.");
        Product p4 = manager.create("strong message");
        p4.use("Hello, Everyone.");
        p4.use("Hello, SA.");
        Product p5 = manager.create("warning box");
        p5.use("This is a Warning box test");
        Product p6 = manager.create("warning box");
        p6.use("This is a slash box test");

    }
}
