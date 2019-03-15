package learn.collection;

import bean.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo05_Iterator {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1() {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        Iterator it = c.iterator();//获取迭代器

        /*boolean b1 = it.hasNext();//判断集合中是否有元素，有就返回true
        Object obj1 = it.next();
        System.out.println(b1);
        System.out.println(obj1);

        boolean b2 = it.hasNext();//判断集合中是否有元素，有就返回true
        Object obj2 = it.next();
        System.out.println(b2);
        System.out.println(obj2);*/

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
        System.out.println();
    }

    private static void method2() {
        Collection c = new ArrayList();
        c.add(new Student("张三", 23));//父类引用指向子类对象，向上转型
        c.add(new Student("李四", 24));
        c.add(new Student("王五", 25));
        c.add(new Student("赵六", 26));
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object o1 = it.next();
            //String name = o2.getName();//为什么这里不能调用getName()，因为上面存入new Student()向上转型成Object，作为父类，Object无法调用子类Student中特有的方法getName()
            //int age = o2.getAge();//同上
            System.out.println(o1);

            Student o2 = (Student) o1;
            String name = o2.getName();
            int age = o2.getAge();
            System.out.println(name + ", " + age);
            System.out.println();
        }
        System.out.println();
    }
}
