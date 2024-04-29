package singleton;

public class LockSingleton {
    private static volatile LockSingleton instance;

    private LockSingleton() {
    }

    public static LockSingleton getInstance() {
        if (instance == null) {
            synchronized (LockSingleton.class) {
                if (instance == null) {
                    //IDEA出现不必要的标黄（在内部调用私有构造是合理的），故添加注释忽略
                    //noinspection InstantiationOfUtilityClass
                    instance = new LockSingleton();
                }
            }
        }
        return instance;
    }


}
