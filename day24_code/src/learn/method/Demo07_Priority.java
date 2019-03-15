package learn.method;

/**
 * @作者: LinTan
 * @日期: 2019/3/8 12:48
 * @版本: 1.0
 * @描述: //设置线程优先级，稍有作用，但不明显
 * 1.0: Initial Commit
 */

public class Demo07_Priority {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName() + "_A");
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName() + "_BB");
                }
            }
        };

        //t1.setPriority(10);//1~10中，数值越大，优先级越高
        //t2.setPriority(1);
        t1.setPriority(Thread.MIN_PRIORITY);//设置最小线程优先级
        t2.setPriority(Thread.MAX_PRIORITY);//设置最大线程优先级
        t1.start();
        t2.start();
    }
}
