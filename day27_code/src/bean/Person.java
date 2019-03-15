package bean;

import java.util.Objects;

/**
 * @作者: LinTan
 * @日期: 2019/3/13 17:25
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 */

public class Person {
    private String name;
    private int age;

    public void eat() {

        System.out.println("今天吃了一顿金钱豹");
    }

    public void eat(int num) {
        System.out.println("今天吃了" + num + "顿金钱豹");
    }

    public Person(String name, int age) {
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//判断调用对象和传入对象的字节码文件是否是同一个字节码文件
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
