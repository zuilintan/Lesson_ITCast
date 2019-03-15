package learn.string;

public class Demo02_StringBuffer {
    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
        Method4();
    }

    private static void Method1() {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = sb1.append(true);
        StringBuffer sb3 = sb1.append("heima");
        StringBuffer sb4 = sb1.append(100);
        System.out.println(sb1);//StringBuffer重写了toString()
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb4);
    }//StringBuffer是字符串缓冲区，new时会在堆中创建一个对象，底层是一个长度为16的字符数组。当调用添加方法时，不会再重新创建对象，而是向原缓冲区添加字符

    private static void Method2() {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1);
        StringBuffer sb2 = sb1.append(true);
        System.out.println(sb2);
        StringBuffer sb3 = sb1.append("heima");
        System.out.println(sb3);
        StringBuffer sb4 = sb1.append(100);
        System.out.println(sb4);
    }

    private static void Method3() {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1);
        sb1.append(true);
        System.out.println(sb1);
        sb1.append("heima");
        System.out.println(sb1);
        sb1.append(100);
        System.out.println(sb1);
    }

    private static void Method4() {
        //StringBuffer sb = new StringBuffer();//StringIndexOutOfBoundsException
        StringBuffer sb = new StringBuffer("ABC");
        sb.insert(3, "heima");
        System.out.println(sb);
    }
}