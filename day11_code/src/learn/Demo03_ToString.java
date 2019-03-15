package learn;

import bean.Student;

public class Demo03_ToString {
    public static void main(String[] args) {
        Student student = new Student("LinTan", 18);
        System.out.println(student);//默认调用toString()
        String string = student.toString();
        System.out.println(string);
    }
}
