package learn.sync;

/**
 * @作者: LinTan
 * @日期: 2019/3/8 23:38
 * @版本: 1.0
 * @描述: //同步代码块: 使用synchronized关键字加上一个临时对象来定义一段代码。若多个synchronized使用同一个临时对象，那么它们就是同步的
 * 1.0: Initial Commit
 * <p>
 * 场景: 当多线程并发，有多段代码同时进行时，我们希望某一段代码执行过程中，CPU不要切换到其它线程工作，这时就需要同步
 * </p>
 */

public class Demo01_Synchronized {
    public static void main(String[] args) {
        Printer1 p = new Printer1();
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
}

class Printer1 {
    //Demo o = new Demo();
    Object o = new Object();

    public void print1() {
        //synchronized (new Object()) {}//锁对象不能是匿名对象，因为匿名对象不是同一个对象
        synchronized (o) {//同步代码块，锁机制，锁对象可以是任意的
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.print("\r\n");//换行
        }
    }

    public void print2() {
        synchronized (o) {
            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.print("\r\n");
        }
    }
}

class Demo {

}