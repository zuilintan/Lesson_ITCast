package 适配器;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 23:42
 * @版本: 1.0
 * @描述: //适配器设计模式
 * 1.0: Initial Commit
 * <p>
 * 概念:
 * 在使用监听器时,需要定义一个类事件监听器接口.
 * 通常接口中有多个方法,而程序中不一定所有的都用到,但又必须重写,很繁琐.
 * 适配器简化了这些操作,我们定义监听器时只要继承适配器,然后重写需要的方法即可
 * 原理:
 * 适配器就是一个类,实现了监听器接口,所有抽象方法都重写了,但是方法全是空的.
 * 适配器需要定义成抽象的,因为创建该类对象,调用空方法无意义.
 * 目的是为了简化程序员的操作,定义监听器时继承适配器,只需要重写需要的方法即可
 * </p>
 */

public class Demo01_Adapter {
    public static void main(String[] args) {

    }
}

interface 和尚 {
    public void 打坐();

    public void 念经();

    public void 撞钟();

    public void 习武();
}

abstract class 天罡星 implements 和尚 {//声明为抽象,不想让其它类创建本类,因为创建也没有意义,方法都是空的.等同于一个过渡z

    @Override
    public void 打坐() {

    }

    @Override
    public void 念经() {

    }

    @Override
    public void 撞钟() {

    }

    @Override
    public void 习武() {

    }
}

class 鲁智深 extends 天罡星 {
    @Override
    public void 习武() {
        System.out.println("倒拔垂杨柳");
        System.out.println("拳打镇关西");
        System.out.println("大闹野猪林");
    }
}
