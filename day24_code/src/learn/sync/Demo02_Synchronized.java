package learn.sync;

/**
 * @作者: LinTan
 * @日期: 2019/3/9 0:53
 * @版本: 1.0
 * @描述: //同步方法
 * 1.0: Initial Commit
 */

public class Demo02_Synchronized {
    public static void main(String[] args) {
        //method1();
        method2();
    }

    private static void method1() {
        Printer2 p = new Printer2();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p.print1();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p.print2();
                }
            }
        }.start();
    }

    private static void method2() {
        Printer2 p = new Printer2();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p.print3();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p.print4();
                }
            }
        }.start();
    }
}

class Printer2 {
    Object o = new Object();

    //非静态的同步方法的锁是神马？是this
    public synchronized void print1() {
        System.out.print("黑");
        System.out.print("马");
        System.out.print("程");
        System.out.print("序");
        System.out.print("员");
        System.out.print("\r\n");//换行

    }

    public synchronized void print2() {
        synchronized (this) {//非静态
            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.print("\r\n");
        }
    }

    //静态的同步方法的锁是神马？是该类的字节码对象
    public static synchronized void print3() {
        System.out.print("黑");
        System.out.print("马");
        System.out.print("程");
        System.out.print("序");
        System.out.print("员");
        System.out.print("\r\n");//换行

    }

    public static synchronized void print4() {
        synchronized (Printer2.class) {//静态
            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.print("\r\n");
        }
    }
}