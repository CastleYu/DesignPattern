package singleton;

import java.util.HashMap;
import java.util.Map;

public class MutiSingleton {
    // 使用枚举定义实例的键
    public enum Key {
        INSTANCE1, INSTANCE2, INSTANCE3;
    }

    private static final Map<Key, MutiSingleton> instances = new HashMap<>();

    private MutiSingleton() {
    }

    public static MutiSingleton getInstance(Key key) {
        synchronized (instances) {
            // 如果Map中没有对应的实例，则创建一个新的实例
            if (!instances.containsKey(key)) {
                instances.put(key, new MutiSingleton());
            }
        }
        return instances.get(key);
    }

    // 示例方法，显示实例的哈希码
    public void showHash() {
        System.out.println("The hashcode of this instance: " + this.hashCode());
    }
}
