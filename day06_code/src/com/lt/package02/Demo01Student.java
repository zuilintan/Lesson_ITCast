package com.lt.package02;

public class Demo01Student {
    public static void main(String[] args) {
        Student student01 = new Student();
        student01.setName("LinTan");
        student01.setAge(18);
        System.out.println(student01.getName() + "，" + student01.getAge());

        Student student02 = new Student("LinYao",18);
        student02.setAge(20);
        System.out.println(student02.getName() + "，" + student02.getAge());
    }
}
