package thread01;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @作者: LinTan
 * @日期: 2019/3/9 22:24
 * @版本: 1.0
 * @描述: //计时器(重点，安卓必须掌握)
 * 1.0: Initial Commit
 */

public class Demo03_Timer {
    public static void main(String[] args) throws InterruptedException {
        //method1();
        method2();
    }

    private static void method1() throws InterruptedException {
        Timer t = new Timer();
        t.schedule(new MyTimerTask(), new Date(2019 - 1900, 3 - 1, 9, 22, 34));
        while (true) {
            Thread.sleep(1000);
            System.out.println(new Date());
        }
    }

    private static void method2() throws InterruptedException {
        Timer t = new Timer();
        t.schedule(new MyTimerTask(), new Date(2019 - 1900, 3 - 1, 9, 22, 45), 3000);//(安排的任务, 开始执行的时间, 重复执行的间隔时间)
        while (true) {
            Thread.sleep(1000);
            System.out.println(new Date());
        }
    }
}

class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("起床背单词");
    }
}
