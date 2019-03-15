package learn;

import bean.Person;

public class Demo06_StringMethod {
    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
        Method4();
        Method5();
        Method6();
    }

    private static void Method1() {
        String s1 = "abc";
        byte[] arr1 = s1.getBytes();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        String s2 = "琲";
        byte[] arr2 = s2.getBytes();
        for (int i = 0; i < arr2.length; i++) {//编码: 将人类语言转换为机器语言的过程
            System.out.print(arr2[i] + " ");//输出结果与你项目编码格式有关
        }//gbk中一个中文占两个字节，且中文第一个字节肯定是负数
        System.out.println();
    }//字符串转换为字节数组

    private static void Method2() {
        String s = "heima";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }//字符串转换为字符数组

    private static void Method3() {
        char[] arr = {'a', 'b', 'c' };
        String s = String.valueOf(arr);
        System.out.println(s);
        System.out.println();
    }//字符数组转换为字符串

    private static void Method4() {
        int i = 100;
        String s = String.valueOf(i);
        System.out.println(s + 100);
        System.out.println();
    }//int类型转换为字符串

    private static void Method5() {
        Person person = new Person("林檀", 18);
        String s = String.valueOf(person);
        System.out.println(s);//等同于person.toString()
        System.out.println(person);//等同于person.toString()
        System.out.println();

    }//对象转换为字符串

    private static void Method6() {
        String s = "LinTan";
        String s1 = s.toUpperCase();//小写转大写
        String s2 = s.toLowerCase();//大写转小写
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();
    }//字符串内字母大小写转换

    private static void Method7() {
        String s1 = "Lin";
        String s2 = "Tan";
        String concat = s1.concat(s2);
        System.out.println(concat);//仅支持字符串间拼接
        System.out.println(s1 + s2);//推荐，可以与任一类型拼接
        System.out.println();
    }//字符串拼接
}
