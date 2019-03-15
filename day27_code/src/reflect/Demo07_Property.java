package reflect;

import bean.Student;
import util.ReflectUtil;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 12:01
 * @版本: 1.0
 * @描述: //此方法可将obj对象中为propertyName的属性值设置为value
 * 1.0: Initial Commit
 */

public class Demo07_Property {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student s = new Student("张三",23);
        System.out.println(s);

        ReflectUtil reflectUtil = new ReflectUtil();
        reflectUtil.setProperty(s,"name","李四");
        System.out.println(s);
    }
}
