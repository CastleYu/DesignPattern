package State;

public interface Context {
    void setClock(int hour);                // �趨ʱ��

    void changeState(State state);          // ״̬�仯

    void callSecurityCenter(String msg);    // ���б�������

    void recordLog(String msg);             // �������ı�����¼
}

