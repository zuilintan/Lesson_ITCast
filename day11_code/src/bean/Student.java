package bean;

/**
 * @作者: LinTan
 * @日期: 2019/2/12 14:04
 * @版本: 1.0
 * @描述: //一个标准的JavaBean
 * 1.0: Initial Commit
 */

public class Student extends Object {
    private String name;//姓名
    private int age;//年龄

    public Student() {
    }

    public Student(String name, int age) {
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.name.equals(student.name) && this.age == student.age;
    }
}
