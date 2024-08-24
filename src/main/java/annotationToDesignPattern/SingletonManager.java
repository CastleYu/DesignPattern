package annotationToDesignPattern;

import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;

public class SingletonManager {
    private static final ConcurrentHashMap<Class<?>, Object> instances = new ConcurrentHashMap<>();

    public static <T> T getInstance(Class<T> clazz) {
        return clazz.cast(instances.computeIfAbsent(clazz, SingletonManager::createInstance));
    }

    private static <T> T createInstance(Class<T> clazz) {
        try {
            if (!clazz.isAnnotationPresent(Singleton.class)) {
                throw new IllegalArgumentException("Class " + clazz.getName() + " is not annotated with @Singleton");
            }
            Constructor<T> constructor = clazz.getDeclaredConstructor();
            boolean wasAccessible = constructor.canAccess(null);
            try {
                constructor.setAccessible(true);  // 允许访问私有构造函数
                return constructor.newInstance();
            } finally {
                constructor.setAccessible(wasAccessible);  // 还原可访问性
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to create singleton instance for class: " + clazz.getName(), e);
        }
    }
}
