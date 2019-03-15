package util;

/**
 * @作者: LinTan
 * @日期: 2019/2/21 18:48
 * @版本: 1.0
 * @描述: //泛型工具类
 * 1.0: Initial Commit
 * 泛型类: 把泛型定义在类上
 * 泛型方法: 把泛型定义在方法上
 */

public class GenericityClassTool<Q> {//泛型类，泛型可自定义，常用的一般有，T: Type，E: Element
    private Q mObject;

    public Q getObject() {
        return mObject;
    }

    public void setObject(Q object) {
        mObject = object;
    }

    public void show(Q q) {
        System.out.println(q);
    }

    public <T> void show(T t, String str) {//有自己的泛型类型的方法

        System.out.println(t + str);
    }

    /*public static void print(Q q) {//反例，静态方法要有自己的泛型，因为静态方法在随着类的加载而加载，此时可能还没有为泛型类的泛型指定类型(创建对象并将地址赋给其带泛型的引用时才指定类型)
    }*/

    public static<Q> void print1(Q q) {
        System.out.println(q);
    }

    public static<W> void print2(W w) {
        System.out.println(w);
    }
}
