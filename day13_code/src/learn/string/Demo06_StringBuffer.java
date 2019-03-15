package learn.string;

public class Demo06_StringBuffer {
    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
    }

    private static void Method1() {
        StringBuffer sb1 = new StringBuffer("heima");
        StringBuffer sb2 = new StringBuffer();
        sb2.append("heima");
        System.out.println(sb1);//通过构造方法将String转换为StringBuffer
        System.out.println(sb2);//通过append()将String转换为StringBuffer
    }

    private static void Method2() {
        StringBuffer sb = new StringBuffer("heima");
        String str1 = new String(sb);
        String str2 = sb.toString();
        String str3 = sb.substring(0, sb.length());
        System.out.println(str1);//通过构造方法将StringBuffer转换为String
        System.out.println(str2);//推荐，通过toString()将StringBuffer转换为String
        System.out.println(str3);//substring()将StringBuffer转换为String
    }

    private static void Method3() {

    }
}
