package learn.collection;

import bean.Student;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02_Collection {
    public static void main(String[] args) {
        Collection c = new ArrayList();//父类引用指向子类对象
        addMethod(c);
        removeMethod(c);
        clearMethod(c);
        containsMethod(c);
        isEmptyMehtod(c);
        sizeMethod(c);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})//CollectionXxx.java使用了未经检查或不安全的操作
    private static void addMethod(Collection c) {//父类引用指向子类对象
        boolean b1 = c.add("abc");//一般不需要返回值，用不到。
        boolean b2 = c.add(true);//自动装箱，等同于new Boolean();
        boolean b3 = c.add(100);
        boolean b4 = c.add(new Student("张三", 23));
        boolean b5 = c.add("abc");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(c);//ArrayList的父类的父类AbstractCollection重写了toString()，所以在打印对象时，输出的结果不是Object类中的toString()的结果
    }//List的add()的返回值都是true，Set的add()，若元素重复，则返回值为false。

    @SuppressWarnings({"rawtypes", "unchecked"})//CollectionXxx.java使用了未经检查或不安全的操作
    private static void removeMethod(Collection c) {
        c.add("b");
        System.out.println(c);
        c.remove("b");//即使没有"b"也不会报错
        System.out.println(c);
    }

    private static void clearMethod(Collection c) {
        c.add("c");
        System.out.println(c);
        c.clear();
        System.out.println(c);
    }

    private static void containsMethod(Collection c) {
        c.add("c");
        c.add("dfg");
        boolean b = c.contains("c");
        System.out.println(b);

    }

    private static void isEmptyMehtod(Collection c) {
        System.out.println(c);
        boolean empty = c.isEmpty();
        System.out.println(empty);
    }

    private static void sizeMethod(Collection c) {
        int size = c.size();
        System.out.println(size);
    }
}
