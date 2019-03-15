package learn.string;

public class Demo05_StringBufferMethod {
    public static void main(String[] args) {
        Method1();
    }

    private static void Method1() {
        StringBuffer sb = new StringBuffer("woaiheima");
        String str1 = sb.substring(4);
        String str2 = sb.substring(4, 7);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(sb);
    }//截取，注意返回值不再是本身，而是一个新字符串
}
