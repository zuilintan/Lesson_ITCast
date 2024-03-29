package 工厂方法模式;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 22:51
 * @版本: 1.0
 * @描述: //工厂接口
 * 1.0: Initial Commit
 * 概念:
 * 工厂方法模式中抽象工厂类负责定义创建对象的接口,具体对象的创建工作由继承抽象工厂的具体类实现。
 * 益处:
 * 客户端不需要再负责对象的创建,从而明确各个类的职责。如果有新的对象增加，只需要增加一个具体的类和具体的工厂类即可，不影响已有代码,后期维护容易,增强了系统的扩展性。
 * 弊端:
 * 需要额外的编写代码，增加了工作量。
 */

public interface Factory {
    public Animal createAnimal();
}
