package learn.list;

import bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @作者: LinTan
 * @日期: 2019/2/19 18:02
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 * <p>
 * 集合的三种遍历方式:
 * 1, 集合转数组(不推荐)
 * 2, 迭代器
 * 3, get()
 * </p>
 */

public class Demo02_List {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Student("张三", 23));//父类引用指向子类对象，向上转型
        list.add(new Student("李四", 24));
        list.add(new Student("王五", 25));
        list.add(new Student("赵六", 26));
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            Student s = (Student) list.get(i);//向下转型
            String name = s.getName();
            int age = s.getAge();
            System.out.println(name + ", " + age);
        }
        System.out.println();
    }
}
