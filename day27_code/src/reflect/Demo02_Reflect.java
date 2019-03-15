package reflect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @作者: LinTan
 * @日期: 2019/3/13 17:58
 * @版本: 1.0
 * @描述: //多态与反射
 * 1.0: Initial Commit
 * <p>
 * </p>
 */

public class Demo02_Reflect {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //method1();//使用多态
        method2();//使用反射
    }

    private static void method1() {
        Juicer j = new Juicer();//购买榨汁机
        j.run(new Apple());//向榨汁机放入苹果
        j.run(new Orange());//向榨汁机放入橘子
    }

    private static void method2() throws ClassNotFoundException, IOException, IllegalAccessException, InstantiationException {
        File file = new File("day27_code/config.properties");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Class clazz = Class.forName(br.readLine());
        Object o = clazz.newInstance();//创建此Class对象所表示的类的一个新实例
        Fruit f = (Fruit) o;
        Juicer j = new Juicer();
        j.run(f);
    }
}

abstract class Fruit {
    public abstract void squeeze();
}

class Apple extends Fruit {
    public void squeeze() {
        System.out.println("榨出一杯苹果汁");
    }
}

class Orange extends Fruit {
    public void squeeze() {
        System.out.println("榨出一杯橘子汁");
    }
}

class Juicer {
    public void run(Fruit a) {
        a.squeeze();
    }
}
