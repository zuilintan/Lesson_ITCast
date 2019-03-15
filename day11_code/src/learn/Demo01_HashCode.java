package learn;

import bean.Student;

public class Demo01_HashCode {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student("LinTan", 18);
        System.out.println(student01.hashCode());//获取Hash码
        System.out.println(student02.hashCode());//获取Hash码
    }
}
