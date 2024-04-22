public class LockSingletonTest {
    public static void main(String[] args) {

        // 需要多线程来体现双向加锁的功能
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    LockSingleton instance = LockSingleton.getInstance();
                    //通过打印哈希码来检测是否为同一个实例
                    System.out.println(instance.hashCode());
                }
            });
        }

        // 启动线程
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        // 等待完成
        for (int i = 0; i < 10; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(e.getMessage());
                //noinspection CallToPrintStackTrace
                e.printStackTrace();
            }
        }
    }
}
