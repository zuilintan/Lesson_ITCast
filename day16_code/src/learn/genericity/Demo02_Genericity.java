package learn.genericity;

import bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @作者: LinTan
 * @日期: 2019/2/20 17:50
 * @版本: 1.0
 * @描述: //ArrayList存储字符串并遍历(泛型版)
 * 1.0: Initial Commit
 */

public class Demo02_Genericity {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }

    private static void method2() {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 23));
        list.add(new Person("李四", 24));
        list.add(new Person("王五", 25));
        list.add(new Person("赵六", 26));
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            Person person = it.next();//将集合的每一个元素用Person记录
            String name = person.getName();
            int age = person.getAge();
            System.out.println(name + ", " + age);
        }
    }
}
