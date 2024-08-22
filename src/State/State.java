package State;

//State接口是一个依据状态而变化的方法的集合
public interface State {
    void doClock(Context context, int hour);    // 设定时间

    void doUse(Context context);                // 使用金库

    void doAlarm(Context context);              // 警铃

    void doPhone(Context context);              // 一般通话
}

