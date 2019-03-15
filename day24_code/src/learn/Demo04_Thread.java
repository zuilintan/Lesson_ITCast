package learn;

/**
 * @作者: LinTan
 * @日期: 2019/3/6 23:19
 * @版本: 1.0
 * @描述: //匿名内部类实现线程的两种方式
 * 1.0: Initial Commit
 */

public class Demo04_Thread {
    public static void main(String[] args) {
        new Thread() {//1.继承Thread类
            @Override
            public void run() {//2.重写run()
                for (int i = 0; i < 1000; i++) {//3.将要执行的代码写在run()中
                    System.out.println("Thread");
                }
            }
        }.start();//4.开启线程

        new Thread(new Runnable() {//1.将Runnable的实现类对象传递给Thread的构造方法
            @Override
            public void run() {//2.重写run()
                for (int i = 0; i < 1000; i++) {//3.将要执行的代码写在run()中
                    System.out.println("Runnable");
                }
            }
        }).start();//4.开启线程
    }
}
