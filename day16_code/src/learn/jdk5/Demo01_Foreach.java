package learn.jdk5;

import bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @作者: LinTan
 * @日期: 2019/2/21 23:04
 * @版本: 1.0
 * @描述: //增强for循环(Foreach)
 * 1.0: Initial Commit
 * <p>
 * 作用: 简化遍历(数组和Collection集合)
 * 格式: for (元素数据类型 变量 : 数组或者Collection集合) {
 * 使用变量即可，该变量就是元素
 * }
 * 底层: 依赖的是迭代器(Iterator)
 * </p>
 */

public class Demo01_Foreach {

    public static void main(String[] args) {
        method1();//遍历数组
        method2();//遍历集合

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");
        method3(list);//三种迭代的删除对比
    }

    private static void method1() {
        int[] arr = {11, 22, 33, 44, 55};
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }

    private static void method2() {
        //遍历集合
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        for (String s : list1) {
            System.out.println(s);
        }

        //遍历集合(自定义对象)
        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(new Person("张三", 23));
        list2.add(new Person("李四", 24));
        list2.add(new Person("王五", 25));
        list2.add(new Person("赵六", 26));
        for (Person person : list2) {
            System.out.println(person);
        }
        System.out.println();
    }

    private static void method3(ArrayList<String> list) {
        //普通for循环
        ArrayList<String> list1 = new ArrayList<>(list);
        for (int i = 0; i < list1.size(); i++) {
            String s = list1.get(i);
            if ("b".equals(s)) {
                list1.remove(i--);//remove后索引整齐前移，需要--追起
            }
        }
        System.out.println(list1);

        //迭代器A
        ArrayList<String> list2 = new ArrayList<>(list);
        //list2.removeIf("b"::equals);
        Iterator<String> it1 = list2.iterator();
        while (it1.hasNext()) {
            String s = it1.next();
            if ("b".equals(s)) {
                //list2.remove("b");//并发修改异常
                it1.remove();
            }
        }
        System.out.println(list2);

        //迭代器B
        for (Iterator<String> it2 = list2.iterator(); it2.hasNext(); ) {
            if ("b".equals(it2.next())) {
                //list2.remove("b");//并发修改异常
                it2.remove();
            }
        }
        System.out.println(list2);

        //增强for循环(底层依赖迭代器)
        ArrayList<String> list3 = new ArrayList<>(list);
        for (String string : list3) {
            if ("b".equals(string)) {
                //list3.remove(3);//并发修改异常
            }//所以增强for循环不能删除，只能遍历
        }
        System.out.println(list3);
    }
}
