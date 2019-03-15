package learn;

import bean.Student;

public class Demo04_Equals {
    public static void main(String[] args) {
        Student student01 = new Student("LinTan", 18);
        Student student02 = new Student("LinTan", 18);
        System.out.println(student01 == student02);//若二者是基本数据类型，则比较值。若二者是引用数据类型，则比较地址
        System.out.println(student01.equals(student02));//重写前，比较地址。重写后，比较值。注意，只有引用数据类型可以用equals
    }
}