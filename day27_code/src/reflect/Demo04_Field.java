package reflect;

import bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 9:52
 * @版本: 1.0
 * @描述: //通过反射获取成员变量
 * 1.0: Initial Commit
 */

public class Demo04_Field {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class clazz = Class.forName("bean.Person");
        Constructor c = clazz.getConstructor(String.class, int.class);
        Person p = (Person) c.newInstance("张三", 23);
        //Field f = clazz.getField("name");//获取字段,无法获取private成员变量
        Field f = clazz.getDeclaredField("name");//获取字段,可以获取private成员变量,暴力反射
        f.setAccessible(true);//去除私有权限,重要
        f.set(p, "李四");
        System.out.println(p);
    }
}
