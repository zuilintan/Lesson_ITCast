package 简单工厂模式;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 22:18
 * @版本: 1.0
 * @描述: //猫类
 * 1.0: Initial Commit
 */

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
