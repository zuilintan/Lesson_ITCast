package thread02;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 13:06
 * @版本: 1.0
 * @描述: //线程组
 * 1.0: Initial Commit
 */

public class Demo04_ThreadGroup {
    public static void main(String[] args) {
        method1();
        method2();//自定义线程组
    }

    private static void method1() {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "张三");
        Thread t2 = new Thread(mr, "李四");
        ThreadGroup tg1 = t1.getThreadGroup();
        ThreadGroup tg2 = t2.getThreadGroup();
        System.out.println(tg1.getName());//默认主线程组
        System.out.println(tg2.getName());
    }

    private static void method2() {
        ThreadGroup tg = new ThreadGroup("自定义线程组A");//创建新的线程组
        MyRunnable mr = new MyRunnable();//创建Runnable实现类对象
        Thread t1 = new Thread(tg, mr, "李狗蛋");//将线程t1放入组中
        Thread t2 = new Thread(tg, mr, "王狗蛋");//将线程t2放入组中
        System.out.println(t1.getThreadGroup().getName());//获取t1所在线程组名
        System.out.println(t2.getThreadGroup().getName());//获取t2所在线程组名
        tg.setDaemon(true);//线程组的优点,可以整组操作,比如设置守护线程
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "_" + i);
        }
    }
}