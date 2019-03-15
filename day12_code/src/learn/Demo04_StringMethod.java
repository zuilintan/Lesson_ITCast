package learn;

public class Demo04_StringMethod {
    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
        Method4();
        Method5();
    }

    private static void Method1() {
        String s1 = "heima";
        String s2 = "heima";
        String s3 = "HeiMa";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println();
    }//是否相同

    private static void Method2() {
        String s1 = "heima";
        String s2 = "heima";
        String s3 = "HeiMa";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println();
    }//是否相同，忽略大小写

    private static void Method3() {
        String s1 = "我爱heima，哈哈";
        String s2 = "heima";
        String s3 = "baima";
        System.out.println(s1.contains(s2));
        System.out.println(s1.contains(s3));
        System.out.println();
    }//是否包含

    private static void Method4() {
        String s1 = "我爱heima，哈哈";
        String s2 = "我爱";
        String s3 = "哈哈";
        System.out.println(s1.startsWith(s2));
        System.out.println(s1.endsWith(s3));
        System.out.println();
    }//是否以XXX开始或结束

    private static void Method5() {
        String s1 = "heima";
        String s2 = "";
        String s3 = null;
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());
        System.out.println();
    }//是否为空。变量赋值为空常量，将无法使用String对象的isEmpty()
}
