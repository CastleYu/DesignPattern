package Decorator;

public abstract class Border extends Display {
    protected final Display display;          // ָװ���������ġ����ݡ�?��?
    protected Border(Display display) { // �ڲ�������ʵ��ʱ���Բ���ָ�������ݡ�
        this.display = display;
    }
}

