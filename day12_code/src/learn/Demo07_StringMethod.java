package learn;

public class Demo07_StringMethod {
    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
    }

    private static void Method1() {
        String s = "LinTan";
        String r1 = s.replace('n', '\0');
        String r2 = s.replace("Tan", "Yao");
        System.out.println(s.replace('A', 'n'));//若oldChar不存在，则不改变
        System.out.println(r1);//替换为空字符
        System.out.println(r2);//CharSequence就是字符序列，string、StringBuilder和StringBuffer本质上都是通过字符数组实现的
    }//替换

    private static void Method2() {
        String s1 = " Tan Lin ";
        String s2 = s1.trim();
        System.out.println(s2);
    }//去除两端空格

    private static void Method3() {
        String s1 = "abc";
        String s2 = "bcd";
        String s3 = "acd";
        String s4 = "abcdef";
        String s5 = "黑";
        String s6 = "马";
        String s7 = "ABC";
        int i1 = s1.compareTo(s2);
        int i2 = s1.compareTo(s3);
        int i3 = s1.compareTo(s4);
        int i4 = s5.compareTo(s6);
        int i7 = s1.compareToIgnoreCase(s7);
        System.out.println(i1);//a: 97，b: 98。97-98=-1
        System.out.println(i2);//b: 98，c: 99。98-99=-1
        System.out.println(i3);//s1.length()为3，s2.length()为6,3-6=-3
        System.out.println(i4);//Unicode码表值相减
        System.out.println('黑' + 0);//Unicode码表值
        System.out.println('马' + 0);//Unicode码表值
        System.out.println(i7);//不区分大小写
    }//按字典顺序比较字符串，结果为正数、负数、0中一种
}
