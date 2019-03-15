package JDK5新特性.枚举类_新版;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 18:17
 * @版本: 1.0
 * @描述: //枚举类的常见方法
 * 1.0: Initial Commit
 */

public class Demo02_Enum {
    public static void main(String[] args) {
        method1();
        method2();

    }

    private static void method1() {
        Week02 mon = Week02.MON;
        Week02 tue = Week02.TUE;
        Week02 wed = Week02.WED;

        //序号
        System.out.println(mon.ordinal());//枚举项都是有编号的
        System.out.println(tue.ordinal());
        System.out.println(wed.ordinal());

        //比较
        System.out.println(mon.compareTo(tue));//比较序号,返回mon的序号减去tue序号的值
        System.out.println(mon.compareTo(wed));

        //名称
        System.out.println(mon.name());//获取实例的名称

        //toString
        System.out.println(tue);//同下
        System.out.println(tue.toString());//未重写toString时返回枚举项名称

        System.out.println();
    }

    private static void method2() {
        Week02 wed = Week02.valueOf(Week02.class, "WED");//等同于通过.class文件获取到一个枚举项对象
        System.out.println(wed);

        Week02[] arr = Week02.values();//虽然在API中找不到,但每个枚举类都有该方法,它可以用来遍历枚举类中所有的枚举值,非常方便
        for (Week02 week02 : arr) {
            System.out.println(week02);
        }
    }
}
