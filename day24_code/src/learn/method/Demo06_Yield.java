package learn.method;

/**
 * @作者: LinTan
 * @日期: 2019/3/8 10:54
 * @版本: 1.0
 * @描述: //礼让线程: 两条线程，理论上A调用yield()后会让出CPU执行权，B去执行。但实际上然并卵，基本看不到效果
 * 1.0: Initial Commit
 */

public class Demo06_Yield {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            if (i % 10 == 0) {
                Thread.yield();
            }
            System.out.println(getName() + "_" + i);
        }
    }
}
