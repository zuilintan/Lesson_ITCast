package 模板方法设计模式;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 16:07
 * @版本: 1.0
 * @描述: //模板设计模式
 * 1.0: Initial Commit
 * <p>
 * 概述:模板方法模式就是定义一个算法的骨架,而将具体的算法延迟到子类中去实现
 * 优点:使用模板方法模式,在定义算法骨架的同时,可以很灵活的实现具体的算法,满足用户灵活多变的需求
 * 缺点:如果算法骨架有修改的话,则需要修改抽象类
 *
 * </p>
 */

public class Demo01_Template {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.getTime());
    }
}

abstract class TimeAbstract {

    public final long getTime() {//final防止子类重写,丢失功能
        long start = System.currentTimeMillis();
        testCode();
        long end = System.currentTimeMillis();
        return end - start;
    }

    public abstract void testCode();
}

class Time extends TimeAbstract {

    @Override
    public void testCode() {
        int i = 0;
        while (i < 100000) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
}