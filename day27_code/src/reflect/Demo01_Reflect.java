/*
package reflect;


import bean.Person;

*/
/**
 * @作者: LinTan
 * @日期: 2019/3/13 17:33
 * @版本: 1.0
 * @描述: //三种反射的方式
 * 1.0: Initial Commit
 * <p>
 * 类的加载概述
 * 当程序要使用某个类时，如果该类还没有被加载到内存中，则系统会通过加载,连接,初始化三步来实现对这个类进行初始化。
 * *
 * 类的加载步骤
 * * 加载
 * * 就是指将class文件读入内存，并为之创建一个对象。任何内存使用时，系统都会创建一个class对象。
 * * 连接
 * * * 验证:是否有正确的内部结构并和其他类协调一致。
 * * * 准备:负责为类的静态成员分配内存，并设置默认出始化值。
 * * * 解析:将类的二进制数据中符号引用替换为直接引用。
 * * 初始化
 * * 就是我们以前讲过的初始化步骤,如默认初始化,显式初始化
 * *
 * 类的加载时机
 * * 1.创建类的实例。eg:person p = new Person();
 * * 2.访问类的静态变量,或者为静态变量赋值。eg:类名.变量
 * * 3.调用类的静态方法。eg:类名.方法
 * * 4.使用反射方式来强制创建某个类或者接口对应的java.lang.Class对象。eg:如下
 * * 5.初始化某个类的子类。eg:父类会优先于子类加载
 * * 6.直接使用java.exe命令来运行某个主类。eg:将硬盘上的字节码文件加载进内存
 * *
 * 类加载器的概述
 * 负责将那.class文件加载到内存中，并为之生成对应的.class对象。虽然我们不关心类的加载机制，但是了解这个机制我们就能更好的理解程序的运行。
 * *
 * 类加载器的分类
 * * 根类加载器(Bootstrap ClassLoader) 根类加载器
 * * 扩展类加载器(Extension ClassLoader) 扩展类加载器
 * * 系统类加载器(System ClassLoader) 系统类加载器
 * *
 * 类加载器的作用
 * * 根类加载器:又称引导类加载器,负责Java核心类的加载,比如System,String等,在JDK中JRE的rt.jar文件中
 * * 扩展类加载器:负责JRE的扩展目录中jar包对的加载,在JDK中JRE的lib目录下ext目录
 * * 系统类加载器:负责在JVM启动时加载来自java命令的class文件,以及classpath环境变量所指定的jar包和类路径
 * *
 * 反射概述
 * * 程序在运行状态中,对于任意一个类,都能知道这个类的所有属性和方法,
 * * 对于任意一个对象,都能够调用它的任意一个方法和属性,
 * * 这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制,
 * * 要想解刨一个类,必须先要获取到该类的字节码文件对象,
 * * 而解刨使用的就是Class类中的方法,所以先要获取到每一个字节码文件对应的Class类型的对象
 * *
 * 反射的三种方式
 * * Class类中静态方法forName(),读取配置文件
 * * 静态属性class,锁对象
 * * Object类的getClass()方法,判断两个对象是否是同一个字节码文件
 * </p>
 *//*


public class Demo01_Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.可以用来读取配置文件
        Class clazz1 = Class.forName("bean.Person");
        //2.可以当做静态方法的锁对象
        Class clazz2 = Person.class;
        //3.可以用来判断是否是同一个字节码对象
        Person p = new Person();
        Class clazz3 = p.getClass();

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
    }
}
*/
