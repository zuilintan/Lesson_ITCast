package learn.jdk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @作者: LinTan
 * @日期: 2019/2/22 20:00
 * @版本: 1.0
 * @描述: 数组转集合
 * 1.0: Initial Commit
 */

public class Demo04_AsList {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    private static void method1() {
        String[] arr = {"a", "b", "c", "d"};
        List<String> list = Arrays.asList(arr);//将数组转换成集合
        //list.add("e");//UnsupportedOperationException，即asList()转成的集合不支持动态增减
        System.out.println(list);
        System.out.println();
    }//虽然不支持增减，但可以用集合的思想操作数组，可以使用除增减外的方法

    private static void method2() {
        int[] arr1 = {11, 22, 33, 44, 55};
        List list1 = Arrays.asList(arr1);//基本数据类型的数组转集合，会将整个数组当做一个对象转换
        //List<int[]> list1 = Arrays.asList(arr1);//上一句的完整写法
        System.out.println(list1);//输出的是地址，因为集合只能存储引用数据类型，arr中一堆int型的值被集合看成了一个对象类型int[]类型

        Integer[] arr2 = {11, 22, 33, 44, 55};
        List list2 = Arrays.asList(arr2);
        //List<Integer[]> list2 = Arrays.asList(arr2);//上一句的完整写法
        System.out.println(list2);//输出元素
    }

    private static void method3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String[] arr1 = list.toArray(new String[0]);//当集合转数组时，若数组的长度<=集合的size时，转换后的数组长度等于集合size。若数组的长度>集合的size时，转换后的数组长度和你指定的相同。
        for (int i = 0; i < arr1.length; i++) {
            String s = arr1[i];
            System.out.println(s);
        }
        System.out.println();

        String[] arr2 = list.toArray(new String[5]);//当集合转数组时，若数组的长度<=集合的size时，转换后的数组长度等于集合size。若数组的长度>集合的size时，转换后的数组长度和你指定的相同。
        for (int i = 0; i < arr2.length; i++) {
            String s = arr2[i];
            System.out.println(s);
        }
    }
}
