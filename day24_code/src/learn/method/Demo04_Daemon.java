package learn.method;

/**
 * @作者: LinTan
 * @日期: 2019/3/7 23:53
 * @版本: 1.0
 * @描述: //守护线程
 * 1.0: Initial Commit
 * <p>
 * 设置一个线程为守护线程，该线程不会单独执行，当其他所有非守护线程都执行结束后，自动退出
 * </p>
 */

public class Demo04_Daemon {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1; i++) {
                    System.out.println(getName() + "A");
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(getName() + "BB");
                }
            }
        };

        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
