package thread01;

/**
 * @作者: LinTan
 * @日期: 2019/3/9 10:17
 * @版本: 1.0
 * @描述: //单例设计模式: 保证类在内存中只有一个对象
 * 1.0: Initial Commit
 * <p>
 * 特点
 * 1.private构造方法，阻止外类随意创建对象，由类内创建一个对象
 * 2.仅对外开放getter方法，提供private属性的访问功能，或者直接定义public static final，阻止外类修改属性值
 * 区别
 * 饿汉式: 空间换时间。多线程访问时，不会创建多个对象。
 * 懒汉式: 时间换空间。多线程访问时，可能创建多个对象。
 * 场景
 * 饿汉式: Runtime，保证多次操作的对象唯一
 * </p>
 */

public class Demo01_Singleton {
    public static void main(String[] args) {
        //Singleton1 s1 = new Singleton1();

        //成员变量被私有，不能通过类名调用
        /*Singleton1 s1 = Singleton1.s;
        Singleton1.s = null;
        Singleton1 s2 = Singleton1.s;*/

        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        System.out.println(s1 == s2);
        System.out.println();

        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();
        System.out.println(s3 == s4);
        System.out.println();

        Singleton3 s5 = Singleton3.s;
        Singleton3 s6 = Singleton3.s;
        System.out.println(s5 == s6);
        System.out.println();
    }
}


/**
 * 饿汉式。推荐，线程安全
 */
class Singleton1 {
    private static Singleton1 s = new Singleton1();//2.创建本类对象，并私有，阻止外类直接访问成员变量的值

    private Singleton1() {
    }//1.私有构造方法，外类不能实例化该类

    //3.对外提供公共的访问方法
    public static Singleton1 getInstance() {//获取实例
        return s;
    }
}

/**
 * 懒汉式。又称单例的延迟加载模式
 */
class Singleton2 {//懒汉式，在多线程访问时会有安全隐患，有可能创建多个对象
    private static Singleton2 s;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (s == null) {//可能出现: 两个线程A和B来访问，线程A通过判断进入语句体中，CPU执行权被线程B抢走，线程B同样通过判断进入语句体中，这时线程A恢复CPU执行权，继续执行语句，创建了对象并赋给变量s，随后线程B也恢复执行权，继续执行语句，同样创建了对象赋给变量s。最终，类在内存中有了两个对象，不符合单例模式的特点
            s = new Singleton2();
        }
        return s;
    }
}

/**
 * 饿汉式。推荐，线程安全
 */
class Singleton3 {
    public static final Singleton3 s = new Singleton3();//2.创建本类对象，并final，阻止外类修改成员变量的值

    private Singleton3() {
    }//1.私有构造方法，外类不能实例化该类
}
