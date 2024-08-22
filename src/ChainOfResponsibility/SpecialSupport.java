package ChainOfResponsibility;

public class SpecialSupport extends Support {
    private final int number;                                 // ֻ�ܽ���˺��������
    public SpecialSupport(String name, int number) {    // ������
        super(name);
        this.number = number;
    }
    protected boolean resolve(Trouble trouble) {     // ����ķ���
        if (trouble.number() == number) {
            return true;
        } else {
            return false;
        }
    }
}

