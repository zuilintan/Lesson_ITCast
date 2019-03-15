package learn.genericity;

/**
 * @作者: LinTan
 * @日期: 2019/2/21 21:46
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 * 泛型接口: 将泛型定义在接口上
 */

public class Demo04_Genericity {
}

interface Inter<T> {
    void show(T t);//默认隐含public abstract
}

class Demo1 implements Inter<String> {//方式1，推荐

    @Override
    public void show(String s) {
        System.out.println();
    }
}

class Demo2<T> implements Inter<T> {//方式2，不推荐，没有必要在实现接口时给自己加泛型
    @Override
    public void show(T t) {
        System.out.println();
    }
}
