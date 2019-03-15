package util;

import java.lang.reflect.Field;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 12:03
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 */

public class ReflectUtil {

    /**
     * 将obj对象中名为propertyName的属性值设置为value
     */
    public void setProperty(Object obj, String propertyName, Object value) throws IllegalAccessException, NoSuchFieldException {
        Class clazz = obj.getClass();
        Field f = clazz.getDeclaredField(propertyName);
        f.setAccessible(true);
        f.set(obj, value);
    }
}
