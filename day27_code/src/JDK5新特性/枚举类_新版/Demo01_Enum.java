package JDK5新特性.枚举类_新版;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 17:36
 * @版本: 1.0
 * @描述: //枚举类_新版
 * 1.0: Initial Commit
 * <p>
 * 注意:
 * * 1.定义枚举类要用关键字enum
 * * 2.所有枚举类都是Enum的子类
 * * 3.枚举类的第一行上必须是枚举项,最后一个枚举项后的分号可以省略,但是如果枚举类有其它东西,这个分号就不能省略,建议不要省略
 * * 4.枚举类可以有构造器,但必须是private的,它默认的也是private的
 * * 5.枚举类也可以有抽象方法,但是枚举项必须重写该方法
 * * 6.枚举在switch语句中可以使用
 * </p>
 */

public class Demo01_Enum {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }

    private static void method1() {
        Week01 mon = Week01.MON;
        Week01 tue = Week01.TUE;
        Week01 wed = Week01.WED;
        System.out.println(mon);
        System.out.println(tue);
        System.out.println(wed);

        System.out.println();
    }

    private static void method2() {
        Week02 mon = Week02.MON;
        Week02 tue = Week02.TUE;
        Week02 wed = Week02.WED;
        System.out.println(mon.getName());
        System.out.println(tue.getName());
        System.out.println(wed.getName());

        System.out.println();
    }

    private static void method3() {
        Week03 mon = Week03.MON;
        Week03 tue = Week03.TUE;
        Week03 wed = Week03.WED;
        mon.show();
        tue.show();
        wed.show();

        System.out.println();
    }

    private static void method4() {
        Week03 week = Week03.WED;
        switch (week) {
            case MON:
                System.out.println("1");
                break;
            case TUE:
                System.out.println("2");
                break;
            case WED:
                System.out.println("3");
                break;
        }
    }
}
