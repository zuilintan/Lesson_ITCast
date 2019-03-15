package learn;

/**
 * @作者: LinTan
 * @日期: 2019/3/6 16:25
 * @版本: 1.0
 * @描述: //多线程的概述
 * 1.0: Initial Commit
 * <p>
 * 线程是程序执行的一条路径，一个进程中可以包含多条线程
 * 多线程并发执行可以提高程序的效率
 * 并行: 多个任务同时运行，需要多核CPU
 * 并发: 多个任务轮流运行，但由于切换间隔较短，使人感觉两个任务都在运行
 * Java程序运行原理: Java命令启动JVM，等于启动了一个应用程序，即一个进程，该进程会自动启动一个主线程，去调用某个类的main()
 * JVM的启动时多线程的吗: 是，JVM启动至少有垃圾回收线程和主线程
 * </p>
 */

public class Demo01_Thread {

    public static void main(String[] args) {
        method1();//证明JVM是多线程的
    }

    private static void method1() {
        for (int i = 0; i < 2000000; i++) {
            new Demo01();
        }//测试JVM是多线程的。至少包含主线程和垃圾回收线程
        //System.out.println(1/0);//异常信息指出线程所在位置
        for (int i = 0; i < 100000; i++) {
            System.out.println("我是主线程");
        }
    }

}

class Demo01 {
    @Override
    public void finalize() {
        System.out.println("垃圾被清扫了");
    }
}