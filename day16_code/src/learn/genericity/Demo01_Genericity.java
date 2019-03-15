package learn.genericity;

import bean.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @作者: LinTan
 * @日期: 2019/2/20 16:16
 * @版本: 1.0
 * @描述: //泛型
 * 1.0: Initial Commit
 * <p>
 * 作用: 限定数据类型，降低安全隐患
 * 好处: 提高安全性，将运行期的错误提前到了编译期，省去了强转的麻烦
 * 注意:
 * A, 前后泛型要一致，JDK7以后后面的泛型可以省略不写(菱形泛型)。
 * B, 泛型只能是引用数据类型，存储的内容会被限定为泛型和泛型的子类类型，
 * eg: List<Person> list = new ArrayList<>();
 * 则list中只能存储Person类和其子类如Student类类型
 * C, 泛型一般不定义为Object，没有意义，因为不加泛型的默认存储类型就是Object
 * </p>
 */

public class Demo01_Genericity {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    private static void method1() {
        ArrayList list = new ArrayList();
        list.add(110);
        list.add(true);
        list.add(new Person("张三", 23));

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
            //此时若想调用Person的setter()和getter()
            //Person p = (Person) it.next();//ClassCastException，类型转换异常。但编译期不会有提示，所以需要泛型
            //System.out.println(p.getName());
        }
    }

    private static void method2() {
        ArrayList<Person> list = new ArrayList<>();
        //list.add(110);//编译不再通过
        //list.add(true);//编译不再通过
        list.add(new Person("张三", 23));
        list.add(new Person("李四", 24));

        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            //System.out.println(it.next().getName() + ", " + it.next().getAge());//反例，注意，每次执行next()都会将指针后移，所以每次循环只能调用一次
            Person person = it.next();
            String name = person.getName();
            int age = person.getAge();
            System.out.println(name + ", " + age);
        }
    }

    private static void method3() {
        List<String> list1 = new ArrayList<>();

        list1.addAll(new ArrayList<String>() {{
            add("str01");
            add("str02");
        }});//不推荐，匿名内部类初始化法，可能会造成内存泄露

        list1.addAll(new ArrayList<>());//不合法

        List<String> list2 = new ArrayList<>();//合法
        list2.add("Temp");
        list1.addAll(list2);

        System.out.println(list1);
    }
}
