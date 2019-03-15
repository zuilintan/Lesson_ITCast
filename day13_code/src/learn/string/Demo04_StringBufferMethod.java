package learn.string;

public class Demo04_StringBufferMethod {
    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
    }

    private static void Method1() {
        StringBuffer sb = new StringBuffer("heima");
        sb.replace(0, 3, "bai");
        System.out.println(sb);
    }//替换

    private static void Method2() {
        StringBuffer sb = new StringBuffer("公主c");
        sb.reverse();
        System.out.println(sb);
    }//反转

    private static void Method3() {

    }
}
