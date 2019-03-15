package learn.list;

import util.StackUtil;

import java.util.LinkedList;

/**
 * @作者: LinTan
 * @日期: 2019/2/20 15:44
 * @版本: 1.0
 * @描述: //模拟进栈和出栈
 * 1.0: Initial Commit
 */

public class Demo04_LinkedList {
    public static void main(String[] args) {
        method1();
        method2();
        method3();//推荐，使用了封装
    }

    private static void method1() {
        LinkedList list = new LinkedList();//创建集合对象
        //压栈
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        System.out.println(list);

        //弹栈
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list);
        System.out.println();
    }

    private static void method2() {
        LinkedList list = new LinkedList();//创建集合对象
        //压栈
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        System.out.println(list);

        //弹栈
        while (!list.isEmpty()) {
            System.out.println(list.removeLast());
        }
        System.out.println(list);
    }

    private static void method3() {
        StackUtil stackUtil = new StackUtil();
        stackUtil.in("a");//压栈
        stackUtil.in("b");
        stackUtil.in("c");
        stackUtil.in("d");
        System.out.println(stackUtil);

        while (!stackUtil.isEmpty()) {//判断栈空
            Object o = stackUtil.out();//弹栈
            System.out.println(o);
        }
    }
}
