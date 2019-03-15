package 工厂方法模式;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 22:55
 * @版本: 1.0
 * @描述: //测试类
 * 1.0: Initial Commit
 */

public class Test {
    public static void main(String[] args) {
        DogFactory df = new DogFactory();
        Dog dog = (Dog) df.createAnimal();
        dog.eat();
    }
}
