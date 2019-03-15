package 动态代理;

import 动态代理.Impl.StudentImp;
import 动态代理.Impl.UserImp;

import java.lang.reflect.Proxy;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 12:47
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 * <p>
 * 动态代理
 * * 概述:本来可以自己做的事情,请了别人来做,被请的人就是代理对象。eg:春节代买票,房屋中介找房
 * * 定义:程序运行过程中产生对象.其实就是我们刚才反射讲到的内容。所以动态代理其实就是通过反射生成一个代理。
 * Java.lang.reflect包下提供了一个Proxy类和InvocationHandler接口,通过它们就可以生成动态代理对象
 * JDK提供的代理只能针对接口做代理,我们以后有更强大的代理cglib,现在先使用Proxy类中的方法创建动态代理类对象
 * </p>
 */
public class Test {
    public static void main(String[] args) {
        //method1();
        method2();
    }

    private static void method1() {
        UserImp userImp = new UserImp();
        userImp.add();
        userImp.delete();

        System.out.println();

        Class<? extends UserImp> userImpClass = userImp.getClass();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userImp);
        IUser iUser = (IUser) Proxy.newProxyInstance(userImpClass.getClassLoader(), userImpClass.getInterfaces(), myInvocationHandler);
        iUser.add();
        iUser.delete();

        System.out.println();
    }

    private static void method2() {
        StudentImp studentImp = new StudentImp();
        studentImp.login();
        studentImp.submit();

        System.out.println();

        Class<? extends StudentImp> studentImpClass = studentImp.getClass();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(studentImp);
        IStudent iStudent = (IStudent) Proxy.newProxyInstance(studentImpClass.getClassLoader(), studentImpClass.getInterfaces(), myInvocationHandler);
        iStudent.login();
        iStudent.submit();
    }
}
