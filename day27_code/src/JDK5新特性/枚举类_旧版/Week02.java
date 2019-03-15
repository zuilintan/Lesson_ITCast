package JDK5新特性.枚举类_旧版;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 17:18
 * @版本: 1.0
 * @描述: //枚举类的实现方式2
 * 1.0: Initial Commit
 */

public class Week02 {
    public static final Week02 MON = new Week02("星期一");
    public static final Week02 TUE = new Week02("星期二");
    public static final Week02 WED = new Week02("星期三");

    private String name;

    private Week02(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
