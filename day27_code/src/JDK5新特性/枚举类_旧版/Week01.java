package JDK5新特性.枚举类_旧版;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 17:16
 * @版本: 1.0
 * @描述: //枚举类的实现方式2
 * 1.0: Initial Commit
 */

public class Week01 {
    public static final Week01 MON = new Week01();
    public static final Week01 TUE = new Week01();
    public static final Week01 WED = new Week01();

    private Week01(){}//私有构造,不让其它类创建本类对象
}
