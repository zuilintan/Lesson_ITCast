package 简单工厂模式;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 22:22
 * @版本: 1.0
 * @描述: //测试类
 * 1.0: Initial Commit
 */

public class Test {
    public static void main(String[] args) {
        /*Cat cat = AnimalFactory.createCat();
        Dog dog = AnimalFactory.createDog();
        System.out.println(cat);
        System.out.println(dog);*/

        Cat cat = (Cat) AnimalFactory.createAnimal("cat");
        Dog dog = (Dog) AnimalFactory.createAnimal("dog");
        cat.eat();
        dog.eat();

    }
}
