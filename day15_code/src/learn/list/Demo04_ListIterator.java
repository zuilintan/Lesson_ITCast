package learn.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo04_ListIterator {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("world");
        list.add("c");
        list.add("d");

        ListIterator listiterator = list.listIterator();//获取迭代器
        while (listiterator.hasNext()) {
            Object o = listiterator.next();//获取元素，并将指针向后移动
            System.out.println(o);
        }
        System.out.println();

        while (listiterator.hasPrevious()) {//需要先正向遍历
            Object o = listiterator.previous();//获取元素，并将指针向后移动
            System.out.println(o);
        }
        System.out.println();
    }
}
