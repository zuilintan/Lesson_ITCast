package learn;

public class Demo05_StringMethod {
    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
        Method4();
        Method5();
        Method6();
        Method7();
        Method8();
        Method9();
    }

    private static void Method1() {
        int[] arr = {1, 2, 3};
        int length1 = arr.length;
        System.out.println(length1);//数组的length是属性
        String s1 = "你是笨蛋吗？";
        int length2 = s1.length();
        System.out.println(length2);//字符串的length()是方法
        System.out.println();
    }//获取字符串长度

    private static void Method2() {
        String s = "你是笨蛋吗？";
        char c = s.charAt(0);
        System.out.println(c);
        System.out.println();
    }

    private static void Method3() {
        String s = "A, 你是笨蛋吗？";
        int i1 = s.indexOf(65);
        int i2 = s.indexOf('笨');
        int i3 = s.indexOf('G');
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);//不存在返回-1
        System.out.println();
    }//获取指定字符的索引

    private static void Method4() {
        String s = "A, 你是笨蛋吗？";
        int i1 = s.indexOf("笨蛋");
        int i2 = s.indexOf("你笨");
        System.out.println(i1);
        System.out.println(i2);//不存在返回-1
        System.out.println();
    }//获取指定字符串的开始索引

    private static void Method5() {
        String s = "A, 你是笨蛋吗？";
        int i1 = s.indexOf('A', 0);
        int i2 = s.indexOf('A', 1);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println();
    }//从指定索引向后，找第一次出现字符的位置

    private static void Method6() {
        String s = "A, 你是笨蛋吗？";
        int i1 = s.indexOf("笨蛋", 0);
        int i2 = s.indexOf("笨蛋", 6);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println();
    }//从指定索引向后，找第一次出现字符串的位置

    private static void Method7() {
        String s = "A, 你是笨蛋吗？";
        int i1 = s.lastIndexOf('笨');
        int i2 = s.lastIndexOf("笨蛋");
        int i3 = s.lastIndexOf('笨', 0);
        int i4 = s.lastIndexOf("笨蛋", 0);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println();
    }//indexOf的逆序

    private static void Method8() {
        String s = "A, 你是笨蛋吗？";
        String s1 = s.substring(1);
        String s2 = s.substring(1, 4);
        System.out.println(s1);//截取起始索引及其后的字符串
        System.out.println(s2);//截取起始索引及其后到结束索引前的字符串(左闭又开区间)
        System.out.println();
    }//截取字符串

    private static void Method9() {
        String s = "LinTan";
        s.substring(3);
        System.out.println(s);//输出:LinTan
        System.out.println();
    }//面试题，障眼法


}
