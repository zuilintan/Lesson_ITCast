package thread02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 11:54
 * @版本: 1.0
 * @描述: //ReenTrantLock,互斥锁(JDK1.5新机制,替代synchronized)
 * 1.0: Initial Commit
 * <p>
 *     同步:
 *     使用ReentrantLock类的Condition方法可以获取对象。
 * </p>
 */

public class Demo03_ReentrantLock {
    public static void main(String[] args) {
        Printer3 p = new Printer3();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        p.print1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        p.print2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        p.print3();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}

class Printer3 {
    private ReentrantLock r = new ReentrantLock();
    private Condition c1 = r.newCondition();//监视器
    private Condition c2 = r.newCondition();
    private Condition c3 = r.newCondition();
    private int flag = 1;

    public void print1() throws InterruptedException {
        r.lock();//获取锁
        if (flag != 1) {
            c1.await();//c1等待
        }
        System.out.print("黑");
        System.out.print("马");
        System.out.print("程");
        System.out.print("序");
        System.out.print("员");
        System.out.print("\r\n");
        flag = 2;
        //this.notify();//注意是随机唤醒单个
        //this.notifyAll();
        c2.signal();//c2唤醒(可以唤醒指定线程,相较于synchronized好了太多)
        r.unlock();//释放锁

    }

    public void print2() throws InterruptedException {
        r.lock();
        if (flag != 2) {
            c2.await();
        }
        System.out.print("传");
        System.out.print("智");
        System.out.print("播");
        System.out.print("客");
        System.out.print("\r\n");
        flag = 3;
        //this.notify();
        //this.notifyAll();
        c3.signal();
        r.unlock();
    }

    public void print3() throws InterruptedException {
        r.lock();
        if (flag != 3) {
            c3.await();
        }//if语句是在哪里等待，就在哪里被唤醒
        System.out.print("I");
        System.out.print("T");
        System.out.print("H");
        System.out.print("M");
        System.out.print("\r\n");
        System.out.print("\r\n");
        flag = 1;
        //this.notify();
        //this.notifyAll();
        c1.signal();
        r.unlock();
    }
}
