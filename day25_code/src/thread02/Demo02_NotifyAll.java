package thread02;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 10:02
 * @版本: 1.0
 * @描述: //三个或三个以上间的线程通信(了解即可，弃用，仅是1.5版本前的解决方案)
 * 1.0: Initial Commit
 */

public class Demo02_NotifyAll {
    public static void main(String[] args) {
        Printer2 p = new Printer2();
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


//等待唤醒机制
class Printer2 {
    Object o = new Object();
    private int flag = 1;

    public void print1() throws InterruptedException {
        synchronized (this) {
            while (flag != 1) {
                this.wait();
            }
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.print("\r\n");
            flag = 2;
            //this.notify();//注意是随机唤醒单个
            this.notifyAll();
        }
    }

    public void print2() throws InterruptedException {
        synchronized (this) {
            while (flag != 2) {
                this.wait();
            }
            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.print("\r\n");
            flag = 3;
            //this.notify();
            this.notifyAll();
        }
    }

    public void print3() throws InterruptedException {
        synchronized (this) {
            while (flag != 3) {
                this.wait();
            }//if语句是在哪里等待，就在哪里被唤醒
            System.out.print("I");
            System.out.print("T");
            System.out.print("H");
            System.out.print("M");
            System.out.print("\r\n");
            System.out.print("\r\n");
            flag = 1;
            //this.notify();
            this.notifyAll();
        }
    }
}