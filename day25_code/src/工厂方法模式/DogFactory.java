package 工厂方法模式;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 22:54
 * @版本: 1.0
 * @描述: //狗的工厂类
 * 1.0: Initial Commit
 */

public class DogFactory implements Factory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
