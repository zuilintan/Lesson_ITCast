package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 10:25
 * @版本: 1.0
 * @描述: //反射的练习
 * 1.0: Initial Commit
 * <p>
 * 1.写一个Properties格式的配置文件,配置类的完整名称
 * 2.写一个程序,读取这个Properties配置文件,获得类的完整名称并加载这个类,用反射的方式运行run()
 * </p>
 */

public class Test01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        File file = new File("day27_code/Test01.properties");//封装一个File路径
        BufferedReader br = new BufferedReader(new FileReader(file));//创建输入流,关联file

        Class clazz = Class.forName(br.readLine());//读取配置文件中类名,获取字节码对象
        Test01_Demo test01_demo = (Test01_Demo) clazz.newInstance();

        //A
        test01_demo.run();

        //B
        Method m = clazz.getMethod("run");
        m.invoke(test01_demo);
    }
}
