package learn.set;

import bean.Person;

import java.util.HashSet;

/**
 * @作者: LinTan
 * @日期: 2019/2/24 11:42
 * @版本: 1.0
 * @描述: HashSet的使用
 * 1.0: Initial Commit
 * <p>
 * 特点: Set集合无索引，不可重复，无序(存取顺序不一致)
 * </P>
 */

public class Demo01_HashSet {
    public static void main(String[] args) {
        //method1();
        method2();
    }

    private static void method1() {
        HashSet<String> hs = new HashSet<>();
        boolean b1 = hs.add("a");
        boolean b2 = hs.add("a");
        hs.add("g");
        hs.add("c");
        hs.add("d");
        System.out.println(hs);//HashSet的继承体系中有重写toString()。JDK8以后，HashSet的实现改变了，虽然还是无序，遍历会自动排序(个人推测)
        System.out.println(b1);
        System.out.println(b2);

        for (String h : hs) {//只要能用迭代器迭代，就可以使用增强for循环遍历
            System.out.println(h);
        }
    }

    private static void method2() {
        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("张三", 23));
        hs.add(new Person("张三", 23));
        hs.add(new Person("李四", 23));
        hs.add(new Person("李四", 23));
        hs.add(new Person("李四", 24));
        hs.add(new Person("李四", 24));
        System.out.println(hs);
    }//存储元素时分两种情况
    //A, 计算出的存储位置目前没有任何元素，则直接将元素存储到该位置
    //B, 计算出的存储位置目前已有元素存在，则调用equals()与其比较。若return true，表示二者相同，则不再添加；若return false，表示二者不同，则按桶式结构添加。
}
