package learn.genericity;

import bean.Student;
import util.ClassTool;
import util.GenericityClassTool;

/**
 * @作者: LinTan
 * @日期: 2019/2/20 19:04
 * @版本: 1.0
 * @描述: //泛型的由来
 * 1.0: Initial Commit
 */

public class Demo03_Genericity {

    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    private static void method1() {
        ClassTool t = new ClassTool();//创建工具类对象
        t.setObject(new Student("张三", 23));//向上转型，即父类引用指向子类对象
        //Worker w = (Worker) t.getObject();//向下转型，ClassCastException，在JDK1.5前，泛型尚未未出现时易出现的该问题。且可以编译期通过，运行期才会抛出异常
    }

    private static void method2() {
        GenericityClassTool<Student> t = new GenericityClassTool<>();//创建泛型工具类
        t.setObject(new Student("张三", 23));
        //Worker w = (Worker) t.getObject();//现在可以在编译期直接报错了
    }

    private static void method3() {
        GenericityClassTool<String> t = new GenericityClassTool<>();
        t.show("abc");
        t.show(true, "1");
    }
}
