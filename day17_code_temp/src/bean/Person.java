package bean;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
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

//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("执行equals()");
//        Person p = (Person) obj;
//        return this.name.equals(p.name) && this.age == p.age;
//    }


    @Override
    public boolean equals(Object o) {//健壮性判断，拿出小本本，通过N多个if考虑可能出现的情况
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }//Override HashCode()，保证元素唯一
    //为什么重写HashCode中选择*31?
    //1, 31是一个质数(只能被1和自身整除的数)
    //2, 31这个数不大也不小
    //3, 31这个数好算，2的5次方-1，即2<<5

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
