package learn.method;

/**
 * @作者: LinTan
 * @日期: 2019/3/7 23:34
 * @版本: 1.0
 * @描述: //休眠线程
 * 1.0: Initial Commit
 */

public class Demo03_Sleep {
    public static void main(String[] args) throws InterruptedException {
        method1();
        method2();
    }

    private static void method1() throws InterruptedException {
        for (int i = 3; i >= 0; i--) {
            Thread.sleep(1000);//中断异常
            System.out.println("倒计时" + i + "秒");
        }

        System.out.println();
    }

    private static void method2() {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "a");
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "b");
                }
            }
        }).start();
    }
}
