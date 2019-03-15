package learn.wrapclass;

/**
 * @作者: LinTan
 * @日期: 2019/2/17 22:57
 * @版本: 1.0
 * @描述: //JDK5的新特性，自动装箱和自动拆箱
 * 1.0: Initial Commit
 * 装箱: 基本类型转换为包装类型
 * 拆箱: 包装类型转换为基本类型
 */

public class Demo04_JDK5 {
    public static void main(String[] args) {
        beforeJdk5();
        afterJdk5();
    }

    private static void beforeJdk5() {
        int i1 = 100;
        Integer integer = new Integer(i1);//将基本类型转换成对象，手动装箱
        int i2 = integer.intValue();//将对象转换成基本类型，手动拆箱
        System.out.println(integer);
        System.out.println(i2);
    }

    private static void afterJdk5() {
        Integer integer = 100;//将基本类型转换成对象，自动装箱
        //Integer integer = null;//NullPointerException，因为下一行语句的底层调用的是Integer对象的intValue()。而integer的值为null，自然找不到Integer对象的intValue()，
        int i = integer + 200;//将对象转换成基本类型，自动拆箱。
        System.out.println(integer);
        System.out.println(i);
    }
}
