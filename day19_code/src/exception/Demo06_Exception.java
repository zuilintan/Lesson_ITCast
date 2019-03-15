package exception;

/**
 * @作者: LinTan
 * @日期: 2019/3/4 11:01
 * @版本: 1.0
 * @描述: throws
 * 1.0: Initial Commit
 * <p>
 * 场景: 定义功能方法时，需要把出现的问题暴露出来，让调用者去处理时
 * 特点:
 * a.若抛出的异常是编译时异常，则需要进行处理(在方法上声明throws)
 * b.若抛出的异常是运行时异常，则可以处理也可不处理
 * throws和throw的区别:
 * a.throws用在方法声明后，跟的异常类名，可以跟多个异常类名，用逗号隔开，表示抛出异常，由该方法调用者来处理
 * b.throw用在方法体内，跟的是异常对象，只能抛出一个异常对象，表示抛出异常，由方法体内的语句处理
 * </p>
 */

public class Demo06_Exception {

    public static void main(String[] args) throws RuntimeException, Exception {
        Person1 person = new Person1();
        person.setAge(-17);
        System.out.println(person.getAge());
    }
}

class Person1 {
    private String name;
    private int age;

    public Person1() {
        super();
    }

    public Person1(String name, int age) {
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

    public void setAge(int age) throws RuntimeException, Exception {
        if (age > 0 && age <= 150) {
            this.age = age;
        } else {
            //System.out.println("请回火星吧");
            throw new Exception("年龄非法");
        }
    }
}