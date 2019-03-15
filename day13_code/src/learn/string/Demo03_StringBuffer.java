package learn.string;

public class Demo03_StringBuffer {
    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
    }

    private static void Method1() {
        StringBuffer sb = new StringBuffer();
        sb.append("heima");
        sb.deleteCharAt(4);//若该索引上无元素，就会报索引越界异常
        sb.delete(0, 2);
        //sb.delete(0, sb.length());//推荐，清空缓冲区。不推荐再new一个StringBuffer赋值给sb，浪费内存


        System.out.println(sb);
    }

    private static void Method2() {
    }

    private static void Method3() {
    }
}
