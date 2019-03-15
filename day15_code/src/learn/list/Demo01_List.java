package learn.list;

import java.util.ArrayList;
import java.util.List;

public class Demo01_List {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }

    private static void method1() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //list.add(5, "z");//IndexOutOfBoundsException
        list.add(4, "z");//index<=size && index>=0，这是实参index范围
        list.add(1, "e");//在指定索引位置添加元素
        System.out.println(list);
        System.out.println();
    }

    private static void method2() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Object obj = list.remove(1);//通过索引移除元素，将被移除的元素值返回。注意，此时不会自动装箱，即无法识别111为Integer对象，而是会当成索引
        System.out.println(obj);
        System.out.println(list);
        System.out.println();
    }

    private static void method3() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Object o = list.get(0);
        System.out.println(o);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }

    private static void method4() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.set(0, "LT");
        System.out.println(list);
        System.out.println();
    }
}
