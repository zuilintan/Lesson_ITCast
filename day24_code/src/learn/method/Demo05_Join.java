package learn.method;

/**
 * @作者: LinTan
 * @日期: 2019/3/8 10:38
 * @版本: 1.0
 * @描述: //加入线程，等待指定线程执行结束后，当前线程再继续(类似插队)
 * 1.0: Initial Commit
 */

public class Demo05_Join {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName() + "A");

                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    if (i == 2) {
                        try {
                            //t1.join();
                            t1.join(1);//插队，并指定时间，计时结束后，线程交替执行
                        } catch (InterruptedException e) {//中断异常
                            e.printStackTrace();
                        }
                    }
                    System.out.println(getName() + "BB");
                }
            }
        };

        t1.start();
        t2.start();
    }
}
