package Memento.game;

import java.util.Vector;

public class Memento {
    final int money;                              // �ֱ߽�Ǯ�ܶ�
    final Vector fruits;                          // ˮ��

    Memento(int money) {                    // �����ӣ�wide interface����Why not public��
        this.money = money;
        this.fruits = new Vector();
    }

    public int getMoney() {                 // ȡ���ֱ߽�Ǯ�ܶnarrow interface��
        return money;
    }

    void addFruit(String fruit) {           // ����ˮ����wide interface��
        fruits.add(fruit);
    }

    Vector getFruits() {
        //return fruits;
        return (Vector) fruits.clone();
    }
}

