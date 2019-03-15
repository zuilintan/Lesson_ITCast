package JDK5新特性.枚举类_新版;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 17:54
 * @版本: 1.0
 * @描述: //枚举类的实现方式2
 * 1.0: Initial Commit
 */

public enum Week02 {
    MON("星期一"), TUE("星期二"), WED("星期三");

    private String name;

    private Week02(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Week02{" +
                "name='" + name + '\'' +
                '}';
    }}
