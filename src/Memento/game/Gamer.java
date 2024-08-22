package Memento.game;

import java.util.Random;
import java.util.Vector;
public class Gamer { 
    private int money;                          // �ֱ߽�Ǯ�ܶ� 
    private Vector fruits = new Vector();       // ˮ�� 
    private final Random random = new Random();       // �����������
    private static final String[] fruitsname = {      // ˮ������һ����,���ֶ�
        "�O��", "����", "�㽶", "����", 
    }; 
    public Gamer(int money) {                   // ������ 
        this.money = money; 
    } 
    public int getMoney() {                     // ȡ��Ŀǰ���ֱ߽�Ǯ�ܶ� 
        return money; 
    } 
    public void bet() {                         // ��ע����ʼ��Ϸ 
        int dice = random.nextInt(6) + 1;       // ������ 
        if (dice == 1) {                        // ��1�Ρ��ֱ߽�Ǯ�б�� 
            money += 100; 
            System.out.println("�ֱ߽�Ǯ�����ˡ�"); 
        } else if (dice == 2) {                 // ��2�Ρ��ֱ߽�Ǯʣһ�� 
            money /= 2; 
            System.out.println("�ֱ߽�Ǯʣһ�롣"); 
        } else if (dice == 6) {                 // ��6�Ρ��õ�ˮ�� 
            String f = getFruit(); 
            System.out.println("�õ�ˮ��(" + f + ")��"); 
            fruits.add(f); 
        } else {                                // �������]�з���ʲô�� 
            System.out.println("�]�з���ʲô�¡�"); 
        } 
    }    
    //!!!���մ洢����Щ���������� 
    public Memento createMemento() {            // ���գ�snapshot�� 
        Memento m = new Memento(money);// ��������ʲô?
        for (Object fruit : fruits) {
            String f = (String) fruit;
            if (f.startsWith("�óԵ�")) {
                m.addFruit(f);
            }
        } 
        return m; 
    } 
    public void restoreMemento(Memento memento) {   // ���и�ԭ 
        this.money = memento.money; 
        this.fruits = memento.getFruits(); 
    } 
    public String toString() {                      // ������ִ� 
        return "[money = " + money + ", fruits = " + fruits + "]"; 
    } 
    private String getFruit() {                     // �õ�1��ˮ�� 
        String prefix = ""; 
        if (random.nextBoolean()) { 
            prefix = "�óԵ�"; 
        } 
        return prefix + fruitsname[random.nextInt(fruitsname.length)]; 
    } 
}

