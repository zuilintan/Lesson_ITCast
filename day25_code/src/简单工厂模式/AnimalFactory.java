package 简单工厂模式;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 22:20
 * @版本: 1.0
 * @描述: //动物工厂类
 * 1.0: Initial Commit
 * <p>
 * 概念:
 * 简单工厂模式,又叫静态工厂模式,它定义了一个具体的工厂类负责创建一些类的实例
 * 益处:
 * 客户端不需要负责对象的创建,从而明确了各个类的职责
 * 弊端:
 * 这个工厂类负责所有对象的创建,若有新的对象添加,或者某些对象的创建方式不同,就需要不断的修改工厂类,不利于后期的维护
 * </p>
 */

public class AnimalFactory {
    //不推荐,这种方式会定义很多方法,复用性很差
    /*public static Dog createDog() {
        return new Dog();
    }

    public static Cat createCat() {
        return new Cat();
    }*/

    //推荐
    public static Animal createAnimal(String name) {
        if ("dog".equals(name)) {//注意,常量在前,防止空指针异常
            return new Dog();
        } else if ("cat".equals(name)) {
            return new Cat();
        } else {
            return null;
        }
    }
}
