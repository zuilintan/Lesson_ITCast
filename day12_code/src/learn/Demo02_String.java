package learn;

public class Demo02_String {
    public static void main(String[] args) {
        //面试题
        //question();
        question1();
        question2();
        question3();
        question4();
        question5();
    }

    private static void question() {
        String str = "abc";//在常量池中对字面值常量"abc"查重，若有则直接将其地址指向变量str。若无则分配空间，存储字面值常量"abc"，将其地址指向变量str
        str = "def";//在常量池中对字面值常量"def"查重，若有则直接将其地址指向变量str。若无则分配空间，存储字面值常量"def"，将其地址指向变量str
        System.out.println(str);//String类重写了toString()，返回值为其本身
    }

    private static void question1() {
        System.out.println("s1和s2是否相等：");
        String s1 = "abc";
        String s2 = "abc";
        getEQ(s1, s2);
    }//"abc"是字面值常量，存储在静态区的常量池中。常量池的值有唯一性，存储时若发现有重复，则不再存储，直接使用已有值。

    private static void question2() {
        System.out.println("该语句在内存中创建了几个对象：");
        String s1 = new String("abc");
        System.out.println(2);
        System.out.println();
    }//两个，常量池和堆中各一个。首先要知道"abc"在常量池中，new出的东东在堆中。而这里意为将常量池中的"abc"复制到了堆中

    private static void question3() {
        System.out.println("s3和s4是否相等：");
        String s3 = new String("abc");
        String s4 = "abc";
        getEQ(s3, s4);
    }//地址不同，变量s3指向的是堆中的地址，变量s4指向的是常量池中地址

    private static void question4() {
        System.out.println("s5和s6是否相等：");
        String s5 = "a" + "b" + "c";
        String s6 = "abc";
        getEQ(s5, s6);
    }//Java编译器有常量优化机制，在编译时s5就已经是"abc"了

    private static void question5() {
        System.out.println("s7和s8是否相等：");
        String s0 = "ab";//常量池
        String s7 = "abc";//常量池
        String s8 = s0 + "c";//堆。字符串串联符号"+"是通过StringBuilder(或StringBuffer)类及其append方法实现
        getEQ(s7, s8);
    }//s0 + "c"会在堆中创建一个StringBuilder(或StringBuffer)对象生成"abc"。然后调用toString()将其转换String类型的对象"abc"，最后将地址赋给s8

    private static void getEQ(String a, String b) {
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println();
    }
}
