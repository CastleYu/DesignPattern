package ChainOfResponsibility;

public class OddSupport extends Support {
    public OddSupport(String name) {                // ������
        super(name);
    }

    protected boolean resolve(Trouble trouble) {    // ����ķ���
        return trouble.number() % 2 == 1;
    }
}

