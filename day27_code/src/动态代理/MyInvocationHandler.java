package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 14:27
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 */

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        method.invoke(target, args);//执行被代理target对象的方法
        System.out.println("日志记录");
        return null;
    }
}
