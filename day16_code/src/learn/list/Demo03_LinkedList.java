package learn.list;

import java.util.LinkedList;

public class Demo03_LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = method1();
        method2(linkedList);
        method3(linkedList);
        method4(linkedList);
    }

    private static LinkedList method1() {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        System.out.println(list);

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        System.out.println(list);//AbstractCollection重写了toString()
        return list;
    }

    private static void method2(LinkedList linkedList) {
        Object first = linkedList.getFirst();
        Object last = linkedList.getLast();
        System.out.println(first);
        System.out.println(last);
    }

    private static void method3(LinkedList linkedList) {
        Object first = linkedList.removeFirst();
        Object last = linkedList.removeLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(linkedList);
    }

    private static void method4(LinkedList linkedList) {
        Object o = linkedList.get(2);
        System.out.println(o);
    }
}
