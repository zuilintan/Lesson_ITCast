package learn;

/**
 * @作者: LinTan
 * @日期: 2019/3/6 17:10
 * @版本: 1.0
 * @描述: //实现多线程的方式2: Runnable
 * 1.0: Initial Commit
 * <p>
 * Thread和Runnable的区别
 * 源码上分析(了解):
 * Thread
 * 由于子类重写了Thread类的run()，所以当调用start()时，会执行子类的run()方法
 * Runnable
 * 构造方法中传入了Runnable接口的引用，并由成员变量保存，当start()调用run()时，由run()内部判断成员变量保存的Runnable引用是否为空，运行时执行的是实现类的run()方法
 * *
 * 通用分析(掌握):
 * Thread
 * 优点: 可以直接使用Thread类中的方法，代码简单
 * 弊端: 如果已经有父类，就不能用这种方法
 * Runnable
 * 优点: 即使自定义的线程类已有父类，也可以实现接口，且接口可以多实现
 * 弊端: 不能直接使用Thread中的方法，需要先获取线程对象，代码复杂
 * </p>
 */

public class Demo03_Thread {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();//4.创建MyRunnable实现类对象
        //此处是父类引用指向子类对象。因为Runnable是接口不能直接创建对象，所以这里传递的是其实现类(子类)
        Thread t = new Thread(mr);//5.将其作为实参传递给Thread的构造方法
        t.start();//6.开启线程

        for (int i = 0; i < 1000; i++) {
            System.out.println("这是main线程");//因为start线程需要一点时间，在这段时间内会继续执行其后语句
        }
    }
}

class MyRunnable implements Runnable {//1.定义一个类，实现Runnable接口

    @Override
    public void run() {//重写run()
        for (int i = 0; i < 1000; i++) {
            System.out.println("这是我的线程");
        }//3.将要执行的代码写在run()中
    }
}