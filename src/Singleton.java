public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    //IDEA出现不必要的标黄（在内部调用私有构造是合理的），故添加注释忽略
                    //noinspection InstantiationOfUtilityClass
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
