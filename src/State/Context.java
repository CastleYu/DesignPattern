package State;

public interface Context {
    void setClock(int hour);                // 设定时间

    void changeState(State state);          // 状态变化

    void callSecurityCenter(String msg);    // 呼叫保安中心

    void recordLog(String msg);             // 保安中心保留记录
}

