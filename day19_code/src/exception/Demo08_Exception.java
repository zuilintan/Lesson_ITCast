package exception;

/**
 * @作者: LinTan
 * @日期: 2019/3/4 17:16
 * @版本: 1.0
 * @描述: //自定义异常
 * 1.0: Initial Commit
 * 为什么要有自定义异常: 通过名字区分到底是什么异常，有针对性的解决问题
 * 注意: 自定义异常既可以继承Exception，也可以继承RuntimeException
 * <p>
 * 异常的注意事项
 * a.子类重写父类方法时，子类的方法必须抛出相同的异常或者该异常的子类
 * b.若父类抛出多个异常，子类重写父类时，只能抛出相同的异常或者其子类，子类不能抛出父类没有的异常
 * c.若被重写的方法，没有异常抛出，那么子类的方法绝对不可以抛出异常。若子类方法内有异常发生，那么子类只能try，不能throws
 * *
 * 如何使用异常处理:
 * 原则: 如果该功能内部可以将问题处理，用try。如果处理不了，需要交由调用者处理，用throws
 * 区别: 后续程序需要继续执行就try(eg: 需要持续输入)。后续程序不需要继续执行就throws
 * </p>
 */

public class Demo08_Exception {
    public static void main(String[] args) throws Exception {
        Person1 person = new Person1();
        person.setAge(-17);
        System.out.println(person.getAge());
    }
}

class AgeOutBoundsException extends Exception {
    public AgeOutBoundsException() {
    }

    public AgeOutBoundsException(String message) {
        super(message);
    }
}

class Person2 {
    private String name;
    private int age;

    public Person2() {
        super();
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeOutBoundsException {
        if (age > 0 && age <= 150) {
            this.age = age;
        } else {
            throw new AgeOutBoundsException("年龄非法");
        }
    }
}