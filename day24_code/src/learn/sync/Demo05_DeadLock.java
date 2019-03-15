package learn.sync;

/**
 * @作者: LinTan
 * @日期: 2019/3/9 1:47
 * @版本: 1.0
 * @描述: //死锁
 * 1.0: Initial Commit
 * <p>
 * 同步代码块嵌套
 * </p>
 */

public class Demo05_DeadLock {
    private static String s1 = "筷子左";
    private static String s2 = "筷子右";

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (s1) {
                        System.out.println(getName() + "获取" + s1 + "，等待" + s2);//1.锁住s1。假设此语句执行后，第二个线程马上执行
                        synchronized (s2) {//3.由于s2没有释放，此处死锁
                            System.out.println(getName() + "拿到" + s2 + "，开吃");
                        }
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (s2) {
                        System.out.println(getName() + "获取" + s2 + "，等待" + s1);//2.锁住s2。假设此语句执行后，第一条线程又开始执行
                        synchronized (s1) {//4.由于s1没有释放，此处死锁
                            System.out.println(getName() + "拿到" + s1 + "，开吃");
                        }
                    }
                }
            }
        }.start();
    }
}
