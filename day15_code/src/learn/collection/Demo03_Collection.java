package learn.collection;

import bean.Student;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03_Collection {
    public static void main(String[] args) {
        method1();
        method2();
        //method3();//反例
    }

    private static void method1() {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        System.out.println(c);
        Object[] arr = c.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void method2() {
        Collection c = new ArrayList();
        c.add(new Student("张三", 23));
        c.add(new Student("李四", 24));
        c.add(new Student("王五", 25));
        c.add(new Student("赵六", 26));
        Object[] array = c.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            Student student = (Student) array[i];//向下转型
            String name = student.getName();
            int age = student.getAge();
            System.out.println(name);
            System.out.println(age);
        }
    }

    /**
     * 注意，这是反例
     * 数组中每个元素的类型必须与数组定义的类型相同
     * 该方法中虽然将Object[]向下转型成Student[]，但数组中的元素却依然是Object类型。
     * 运行报ClassCastException
     */
    private static void method3() {
        Collection c = new ArrayList();
        c.add(new Student("张三", 23));
        c.add(new Student("李四", 24));
        c.add(new Student("王五", 25));
        c.add(new Student("赵六", 26));
        Student[] array = (Student[]) c.toArray();//向下转型
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            String name = array[i].getName();
            int age = array[i].getAge();
            System.out.println(name);
            System.out.println(age);
        }
    }
}
