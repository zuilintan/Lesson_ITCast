package JDK5新特性.枚举类_旧版;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 17:11
 * @版本: 1.0
 * @描述: //枚举类_旧版
 * 1.0: Initial Commit
 * <p>
 * 概述:指将变量的值一一列出来,变量的值只限于列举出来的值的范围内,举例:一周只有7天,一年只有12个月
 * 区别:单例设计模式是一个类在内存中只有一个实例,枚举类就是多例类,但并非无限个,而是有限个
 * </p>
 */

public class Demo01_Enum {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    private static void method1() {
        Week01 mon = Week01.MON;
        Week01 tue = Week01.TUE;
        Week01 wed = Week01.WED;
        System.out.println(mon);
    }

    private static void method2() {
        Week02 mon = Week02.MON;
        Week02 tue = Week02.TUE;
        Week02 wed = Week02.WED;
        System.out.println(tue.getName());
    }

    private static void method3() {
        Week03 mon = Week03.MON;
        Week03 tue = Week03.TUE;
        Week03 wed = Week03.WED;
        wed.show();
    }
}
