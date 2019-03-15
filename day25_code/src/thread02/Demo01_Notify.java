package thread02;

/**
 * @作者: LinTan
 * @日期: 2019/3/9 22:47
 * @版本: 1.0
 * @描述: //线程间的通信
 * 1.0: Initial Commit
 * <p>
 * 场景:
 * 1.多个线程并发执行时，在默认情况下CPU是随机切换线程的。如果我们希望它们有规律的执行，就可以使用通信，例如每个线程执行一次打印。
 * 用法:
 * 1.希望线程等待，调用wait()。
 * 2.希望唤醒等待的线程，就调用notify()。
 * 3.这两个方法必须在同步代码块中执行，并且使用同步锁给对象来调用。
 * 注意:
 * 1.在同步中，用什么对象作为锁，就该用什么对象调用wait()和notify()以及notifyAll()。eg: this。
 * 2.为什么wait()和notify()以及notifyAll()被定义在Object类中？因为锁对象可以是任意对象，Object又是所有类的基类(父类或超类)，没有比其更好的位置定义了
 * 3.sleep()和wait()方法的区别？sleep()必须传入参数，参数是时间，时间到了自动醒来。wait()可以传或不传参数，传参就是在参数时间结束后等待，不传就是直接等待。
 * 4.sleep()在同步方法或者同步代码块中不释放锁(即不转交CPU执行权)。wait()释放锁。
 * </p>
 */

public class Demo01_Notify {

    public static void main(String[] args) {
        Printer1 p = new Printer1();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {//只能处理，因为父类没有抛异常
                        p.print1();//JDK8特性，不需要加final，底层会实现
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


    }

}

//等待唤醒机制
class Printer1 {
    Object o = new Object();
    private int flag = 1;

    public void print1() throws InterruptedException {
        synchronized (this) {
            if (flag != 1) {
                this.wait();
            }
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.print("\r\n");
            flag = 2;
            this.notify();//随机唤醒单个等待的线程，若没有发现可唤醒的线程则跳过
        }
    }

    public void print2() throws InterruptedException {
        synchronized (this) {
            if (flag != 2) {
                this.wait();
            }
            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.print("\r\n");
            System.out.print("\r\n");
            flag = 1;
            this.notify();
        }
    }
}