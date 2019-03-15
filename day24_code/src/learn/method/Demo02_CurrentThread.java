package learn.method;

/**
 * @作者: LinTan
 * @日期: 2019/3/7 0:04
 * @版本: 1.0
 * @描述: //获取当前线程对象
 * 1.0: Initial Commit
 */

public class Demo02_CurrentThread {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        new Thread() {
            @Override
            public void run() {
                System.out.println(getName());
            }
        }.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("我是主线程");
        System.out.println(Thread.currentThread().getName());
    }
}
