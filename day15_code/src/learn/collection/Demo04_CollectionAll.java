package learn.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo04_CollectionAll {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }

    private static void method1() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("e");
        c2.add("f");
        c2.add("g");
        c2.add("h");

        boolean b = c1.addAll(c2);//将c2添加到c1中
        System.out.println(b);
        System.out.println(c1);
        System.out.println();
    }

    private static void method2() {

        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("b");
        c2.add("c");

        boolean b = c1.removeAll(c2);
        System.out.println(b);
        System.out.println(c1);
        System.out.println();
    }

    private static void method3() {

        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("b");
        c2.add("f");

        boolean b = c1.containsAll(c2);
        System.out.println(b);
        System.out.println(c1);
        System.out.println();
    }

    private static void method4() {

        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("b");
        c2.add("f");

        Collection c3 = new ArrayList();
        c3.add("x");
        c3.add("y");

        boolean b2 = c1.retainAll(c3);
        System.out.println(b2);
        System.out.println(c1);
        boolean b1 = c1.retainAll(c2);//取交集，并将取交集的结果赋给c1。若c1因此改变则返回true，不变则返回false
        System.out.println(b1);
        System.out.println(c1);
        System.out.println();
    }
}
