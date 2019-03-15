package reflect;

import bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 10:06
 * @版本: 1.0
 * @描述: //通过反射获取成员方法,并执行
 * 1.0: Initial Commit
 */

public class Demo05_Method {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class clazz = Class.forName("bean.Person");
        Constructor c = clazz.getConstructor(String.class, int.class);
        Person p = (Person) c.newInstance("张三", 23);
        //A
        p.eat();//执行方法
        p.eat(5);//执行带参方法

        //B
        Method m1 = clazz.getMethod("eat");//获取方法
        Method m2 = clazz.getMethod("eat", int.class);//获取带参方法
        m1.invoke(p);//执行方法
        m2.invoke(p, 6);//执行带参方法
    }
}
