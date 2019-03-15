package learn.method;

/**
 * @作者: LinTan
 * @日期: 2019/3/6 23:41
 * @版本: 1.0
 * @描述: //获取与设置名字
 * 1.0: Initial Commit
 * <p>
 * 可以通过构造方法，和setter设置线程名称
 * </p>
 */

public class Demo01_Name {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    private static void method1() {
        new Thread("冰") {
            @Override
            public void run() {
                System.out.println(getName());
            }
        }.start();

        new Thread("火") {
            @Override
            public void run() {
                System.out.println(this.getName());
            }
        }.start();
    }

    private static void method2() {
        new Thread() {
            @Override
            public void run() {
                setName("魔");
                System.out.println(getName());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                this.setName("厨");
                System.out.println(this.getName());
            }
        }.start();
    }

    private static void method3() {
        Thread t1 = new Thread() {//new 类() {}代表该类的子类，将其赋给Thread类的引用，即父类引用指向子类对象
            @Override
            public void run() {
                System.out.println(getName());
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println(this.getName());
            }
        };
        t1.setName("并未");
        t2.setName("看过");
        t1.start();
        t2.start();
    }
}
