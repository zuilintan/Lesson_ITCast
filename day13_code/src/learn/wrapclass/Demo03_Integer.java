package learn.wrapclass;

public class Demo03_Integer {
    public static void main(String[] args) {
        //int2String
        int i = 100;
        String s1 = int2String1(i);//推荐
        String s2 = int2String2(i);//推荐
        String s3 = int2String3(i);
        String s4 = int2String4(i);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        //String2int
        String s = "123";
        int i1 = string2Int1(s);
        int i2 = string2Int2(s);//推荐
        System.out.println(i1);
        System.out.println(i2);
    }

    private static String int2String1(int i) {
        String s = i + "";
        return s;
    }

    private static String int2String2(int i) {
        String s = String.valueOf(i);
        return s;
    }

    private static String int2String3(int i) {
        Integer integer = new Integer(i);
        String s = integer.toString();
        return s;
    }

    private static String int2String4(int i) {
        String s = Integer.toString(i);
        return s;
    }

    private static int string2Int1(String s) {
        Integer integer = new Integer(s);
        int i = integer.intValue();
        return i;
    }

    private static int string2Int2(String s) {
        int i = Integer.parseInt(s);
        return i;
    }//基本数据类型的包装类有八种，其中七种都有parseXxx()，可以将这七种的字符串表现形式转换为基本数据类型
    //char类型没有，建议使用String的toCharArray()
}
