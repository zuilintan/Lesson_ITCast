package learn.string;

public class Demo01_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.length());//容器中字符个数，实际值
        System.out.println(sb1.capacity());//容器的容量，理论值
        StringBuffer sb2 = new StringBuffer(10);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        StringBuffer sb3 = new StringBuffer("heima");
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());//字符串的length+初始容量=21
    }//String是不可变的字符序列。StringBuffer和StringBuilder是可变的字符序列。
    //StringBuffer是在JDK1.0推出的，线程安全(同步)，效率低
    //StringBuilder是在JDK1.5推出的，线程不安全(异步)，效率高
}
