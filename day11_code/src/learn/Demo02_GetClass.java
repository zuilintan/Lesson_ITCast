package learn;

import bean.Student;

public class Demo02_GetClass {
    public static void main(String[] args) {
        Student student = new Student();
        Class clazz = student.getClass();//获取该对象的类
        System.out.println(clazz);
        String clazzName = clazz.getName();//通过类获取全类名
        System.out.println(clazzName);
    }
}
