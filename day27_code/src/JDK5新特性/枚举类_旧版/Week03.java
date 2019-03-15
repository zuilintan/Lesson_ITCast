package JDK5新特性.枚举类_旧版;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 17:22
 * @版本: 1.0
 * @描述: //枚举类的实现方式2
 * 1.0: Initial Commit
 */

public abstract class Week03 {
    public static final Week03 MON = new Week03("星期一") {
        @Override
        public void show() {
            System.out.println(getName());
        }
    };
    public static final Week03 TUE = new Week03("星期二") {
        @Override
        public void show() {
            System.out.println(getName());
        }
    };

    public static final Week03 WED = new Week03("星期三") {
        @Override
        public void show() {
            System.out.println(getName());
        }
    };

    private String name;

    private Week03(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
