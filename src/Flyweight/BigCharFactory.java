package Flyweight;

import java.util.Hashtable;

public class BigCharFactory {
    // Singleton Pattern
    private static final BigCharFactory singleton = new BigCharFactory();
    // �������е�BigChar�Ķ���ʵ��
    private final Hashtable pool = new Hashtable();

    // �����ӣ�Ϊ��ҪPrivate��
    private BigCharFactory() {

    }

    // ȡ��Ψһ�Ķ���ʵ��
    public static BigCharFactory getInstance() {
        return singleton;
    }

    // ����������BigChar�Ķ���ʵ��
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar) pool.get("" + charname);
        if (bc == null) {//���û������ַ����򴴽������Ҵ˶������
            //������һ��
            bc = new BigChar(charname);    // �ڴ˲���BigChar�Ķ���ʵ��
            pool.put("" + charname, bc);
        }
        return bc;
    }
}

