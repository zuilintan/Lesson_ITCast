package learn.genericity;

import bean.Person;
import bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @作者: LinTan
 * @日期: 2019/2/21 22:01
 * @版本: 1.0
 * @描述: //泛型通配符<?>
 * 1.0: Initial Commit
 * <p>
 * <?>: 代表任意类型，若未明确，那么就是Object以及任意Java类
 * <? extends E>: 上界通配符，向下限定，可存E及其子类。这里?是子类，E是父类。eg: Collection接口的addAll()
 * <? super E>: 下届通配符，向上限定，E及其父类。
 * </P>
 */

public class Demo05_Genericity {

    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1() {
        //泛型的一般用法
        List<String> list1 = new ArrayList<String>();
        //但，有些时候赋值运算符右侧可能是个方法，我们无法确定其返回值类型，该怎么办呢？
        List<?> list2 = test1();//当右边的泛型不确定时，左边可以指定为?
    }

    private static ArrayList<Integer> test1() {
        return new ArrayList<>();
    }

    private static void method2() {
        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("张三", 23));
        list1.add(new Person("李四", 24));
        list1.add(new Person("王五", 25));
        System.out.println(list1);

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("赵六", 26));
        list2.add(new Student("周七", 27));
        System.out.println(list2);

        list1.addAll(list2);
        System.out.println(list1);

        //list2.add(list1);//反例
    }
}
