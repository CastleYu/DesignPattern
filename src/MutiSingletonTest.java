public class MutiSingletonTest {
    public static void main(String[] args) {
        MutiSingleton instance1 = MutiSingleton.getInstance(MutiSingleton.Key.INSTANCE1);
        MutiSingleton instance2 = MutiSingleton.getInstance(MutiSingleton.Key.INSTANCE2);
        MutiSingleton instance3 = MutiSingleton.getInstance(MutiSingleton.Key.INSTANCE3);

        // 打印实例的哈希码
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance3.hashCode());
    }
}