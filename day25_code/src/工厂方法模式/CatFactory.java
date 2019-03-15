package 工厂方法模式;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 22:52
 * @版本: 1.0
 * @描述: //猫的工厂类
 * 1.0: Initial Commit
 */

public class CatFactory implements Factory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
