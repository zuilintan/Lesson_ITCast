package JDK8新特性;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 21:09
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 * <p>
 * 新特性
 * 1.接口中可以直接定义有方法体的静态方法,若为非静态,需要要用default修饰
 * 2.局部内部类调用其外的局部变量,可不加final修饰,默认隐含final
 * *
 * 为什么局部内部类在访问他所在的方法中的局部变量必须使用final修饰?
 * 因为当调用这个方法时,局部变量如果没有用final修饰,它和方法的生命周期是一样的,当方法弹栈时,这个局部变量也会消失,那么如果局部内部类对象还没有马上消失,想用这个局部变量,就没有了,如果用final修饰,该局部变量就会在类加载时进入常量池,即使方法弹栈,常量池的常量还在,也可以继续使用
 * </p>
 */

public class Demo01_JDK8 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.print();
        Inter.method();

        demo.run();
    }
}

interface Inter {

    public static void method() {
        System.out.println("static method");
    }//静态可直接写方法体

    public default void print() {
        System.out.println("Hello World");
    }//非静态加default后可写方法体
}

class Demo implements Inter {
    public void run() {
        int num = 10;//final可加可不加
        class Inner {
            public void fun() {
                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.fun();
    }
}