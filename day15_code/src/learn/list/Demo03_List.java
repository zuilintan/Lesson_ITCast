package learn.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @作者: LinTan
 * @日期: 2019/2/19 14:10
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 * <p>
 * 需求: 存在一个集合，判断其中是否存在"word"这个元素。若有，则在其后添加一个"javaee"元素
 * </p>
 */

public class Demo03_List {
    public static void main(String[] args) {
        method1();//反例
        method2();
    }

    private static void method1() {
        List list = new ArrayList();
        list.add("a");//向上转型为Object，自动的
        list.add("b");
        list.add("word");
        list.add("c");
        list.add("d");
        list.add("e");

        Iterator it = list.iterator();//获取迭代器(Collection特有的方法)
        while (it.hasNext()) {
            String str = (String) it.next();
            if ("word".equals(str)) {//注意，尽可能用常量.equals()1
                //list.add("javaee");//ConcurrentModificationException，并发修改异常，遍历的同时在修改集合
            }
        }
        System.out.println(list);
        System.out.println();
    }

    private static void method2() {
        List list = new ArrayList();
        list.add("a");//向上转型为Object，自动的
        list.add("b");
        list.add("word");
        list.add("c");
        list.add("d");
        list.add("e");

        ListIterator it = list.listIterator();//获取迭代器(List特有的方法)
        while (it.hasNext()) {
            String str = (String) it.next();
            if ("word".equals(str)) {//注意，尽可能用常量.equals()1
                it.add("javaee");//ListIterator特有的add()，可以解决并发修改异常
            }
        }
        System.out.println(list);
        System.out.println();
    }
}
