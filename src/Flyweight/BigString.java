package Flyweight;

public class BigString {
    // ���������֡�������
    private final BigChar[] bigchars;
    // ������
    public BigString(String string) {
        bigchars = new BigChar[string.length()];//��������
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchars.length; i++) {
            //�������������ܻ�������Ӧ��ָ��ͬһ�����󣬽�Լ�˿ռ�
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }
    // ��ʾ
    public void print() {
        for (BigChar bigchar : bigchars) {
            //���Ҫ���12121212121212121212����Ȼ�������20���ַ�����ʵ��
            //�����Ķ���ֻ��2��
            bigchar.print();
        }
    }
}

