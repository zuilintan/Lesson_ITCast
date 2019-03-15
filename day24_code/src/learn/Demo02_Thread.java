package learn;

/**
 * @作者: LinTan
 * @日期: 2019/3/6 16:55
 * @版本: 1.0
 * @描述: //实现多线程的方式1: Thread
 * 1.0: Initial Commit
 */

public class Demo02_Thread {
    public static void main(String[] args) {
        MyThread01 mt = new MyThread01();//4.创建Thread类的子对象
        mt.start();//5.开启线程

        for (int i = 0; i < 1000; i++) {
            System.out.println("这是main线程");//因为start线程需要一点时间，在这段时间内会继续执行其后语句
        }
    }
}

class MyThread01 extends Thread {//1.继承Thread
    @Override
    public void run() {//2.重写run()
        for (int i = 0; i < 1000; i++) {
            System.out.println("这是我的线程");
        }//3.将要执行的代码写在run()中
    }
}