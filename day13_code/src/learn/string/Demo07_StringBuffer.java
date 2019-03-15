package learn.string;

public class Demo07_StringBuffer {
    public static void main(String[] args) {
        String s = "heima";
        System.out.println(s);
        change(s);
        System.out.println(s);//String类虽然是引用数据类型，但因为其真实值一旦创建就不会被改变，所以此处s依然是黑马
        System.out.println();

        StringBuffer sb = new StringBuffer();
        sb.append("heima");
        System.out.println(sb);
        change(sb);
        System.out.println(sb);
        System.out.println();
    }

    private static void change(StringBuffer sb) {
        sb.append("ITCast");//直接在堆中更改StringBuffer对象中的"heima"，追加字符串"ITCast"
    }

    private static void change(String s) {//两个s虽然不是同一个变量，都指向常量池中的"heima"
        s += "ITCast";//对s指向的"heima"进行更改，本质上是新创建了一个字符串"ITCast"，存储在常量池中。并将其地址值指向变量s。但change()执行后弹栈，该字符串的引用s，随方法的弹栈而消失，字符串"ITCast"也变为垃圾，等待回收
    }
}
