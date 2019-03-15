package learn.sync;

/**
 * @作者: LinTan
 * @日期: 2019/3/9 1:34
 * @版本: 1.0
 * @描述: //火车站售票，实现Runnable接口
 * 1.0: Initial Commit
 */

public class Demo04_Ticket {
    public static void main(String[] args) {
        MyTicket mt = new MyTicket();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();

        //多次启动一个线程是非法的，IllegalThreadStateException
        /*Thread t = new Thread(mt);
        t.start();
        t.start();
        t.start();
        t.start();*/
    }
}

class MyTicket implements Runnable {
    private static Object sObject = new Object();//如果用引用数据类型成员变量当做锁对象，必须是静态
    private int ticket = 100;//不需要定义静态，因为MyTicket只创建一次对象

    @Override
    public void run() {
        while (true) {
            synchronized (this) {//或者用Ticket.class和sObject
                if (ticket == 0) {
                    break;
                }
                try {
                    Thread.sleep(100);//出现卖负号票的问题，需要同步代码块
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "这是第" + ticket-- + "号票");
            }
        }
    }
}