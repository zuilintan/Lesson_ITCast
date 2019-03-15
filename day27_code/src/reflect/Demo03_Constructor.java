package reflect;

import bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @作者: LinTan
 * @日期: 2019/3/13 23:18
 * @版本: 1.0
 * @描述: //通过反射获取带参构造方法,并初始化对象
 * 1.0: Initial Commit
 */

public class Demo03_Constructor {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Class.forName("bean.Person");
        //Person p = (Person) clazz.newInstance();//注意,该语句是通过无参构造创建对象,若Person只有参构造,则会报InstantiationException
        //System.out.println(p);
        Constructor c = clazz.getConstructor(String.class, int.class);//获取有参构造(不要惊讶int也有.class,其实void也有)
        Person p = (Person) c.newInstance("张三", 23);//通过有参构造创建对象
        System.out.println(p);
    }
}
