package learn.wrapclass;

/**
 * @作者: LinTan
 * @日期: 2019/2/17 21:55
 * @版本: 1.0
 * @描述: //包装类
 * 1.0: Initial Commit
 * 作用: 将基本数据类型封装成对象的
 * 优点: 可以在对象中定义更多的功能方法操作该数据
 * 场景: 基本数据类型与字符串间转换
 * <p>
 * byte    Byte
 * short   Short
 * int     Integer
 * long    Long
 * float   Float
 * double  Double
 * char    Character
 * boolean Boolean
 * </p>
 */

public class Demo01_Integer {
    public static void main(String[] args) {
        String s1 = Integer.toBinaryString(60);
        String s2 = Integer.toOctalString(60);
        String s3 = Integer.toHexString(60);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
