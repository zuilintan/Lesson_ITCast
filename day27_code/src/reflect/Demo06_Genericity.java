package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 10:27
 * @版本: 1.0
 * @描述: //泛型擦除,又叫泛型反射,通过反射越过泛型检查
 * 1.0: Initial Commit
 * <p>
 * 特点:泛型只在编译期有效,运行期会被擦除掉
 * </p>
 */

public class Demo06_Genericity {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        //list.add("abc");

        Class clazz = Class.forName("java.util.ArrayList");//获取字节码对象
        Method m = clazz.getMethod("add", Object.class);//获取方法
        m.invoke(list, "abc");//执行方法
        System.out.println(list);
    }
}
