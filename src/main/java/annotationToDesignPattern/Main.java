package annotationToDesignPattern;

public class Main {
    public static void main(String[] args) {
        MySingletonClass instance1 = SingletonManager.getInstance(MySingletonClass.class);
        MySingletonClass instance2 = SingletonManager.getInstance(MySingletonClass.class);
        instance1.showMessage();

        // 验证是否为同一个实例
        System.out.println(instance1 == instance2);  // 应该打印 true
    }
}
