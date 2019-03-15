package learn.sync;

/**
 * @作者: LinTan
 * @日期: 2019/3/9 1:14
 * @版本: 1.0
 * @描述: //铁路售票，100张，通过4个窗口卖完
 * 1.0: Initial Commit
 */

public class Demo03_Ticket {
    public static void main(String[] args) {
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();
    }
}

class Ticket extends Thread {
    private static Object sObject = new Object();//如果用引用数据类型成员变量当做锁对象，必须是静态
    //private int ticket = 100;//线程不安全
    private static int ticket = 100;//线程安全

    @Override
    public void run() {
        while (true) {
            synchronized (sObject) {//或者用Ticket.class
                if (ticket == 0) {
                    break;
                }
                try {
                    Thread.sleep(100);//出现卖负号票的问题，需要同步代码块
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "这是第" + ticket-- + "号票");
            }
        }
    }
}