package JDK5新特性.枚举类_新版;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 17:53
 * @版本: 1.0
 * @描述: //枚举类的实现方式3
 * 1.0: Initial Commit
 */

public enum Week03 {
    MON("星期一") {
        @Override
        public void show() {
            System.out.println(getName());
        }
    },
    TUE("星期二") {
        @Override
        public void show() {
            System.out.println(getName());
        }
    },
    WED("星期三") {
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