package learn.wrapclass;

/**
 * @作者: LinTan
 * @日期: 2019/2/17 22:11
 * @版本: 1.0
 * @描述: //int的包装类，Integer
 * 1.0: Initial Commit
 */

public class Demo02_Integer {
    public static void main(String[] args) {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println(minValue);
        System.out.println(maxValue);

        Integer i1 = new Integer(100);
        //Integer i2 = new Integer("abc");//NumberFormatException数字格式异常
        Integer i2 = new Integer("100");
        System.out.println(i1);
        System.out.println(i2);
    }
}
