package State;

//State�ӿ���һ������״̬���仯�ķ����ļ���
public interface State {
    void doClock(Context context, int hour);    // �趨ʱ��

    void doUse(Context context);                // ʹ�ý��

    void doAlarm(Context context);              // ����

    void doPhone(Context context);              // һ��ͨ��
}

