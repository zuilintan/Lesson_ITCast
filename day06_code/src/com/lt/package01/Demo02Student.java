package com.lt.package01;

public class Demo02Student {
    //导包: import com.lt.package01.Student;//同包可省略
    //创建: Student mStudent = new Student();
    //使用: 1.mStudent.name 2.mStudent.eat();

    public static void main(String[] args) {
        Student mStudent = new Student();
        System.out.println(mStudent.name);
        System.out.println(mStudent.age);

        mStudent.name = "林檀";
        mStudent.age = 18;
        System.out.println(mStudent.name);
        System.out.println(mStudent.age);
        mStudent.eat();
    }
}
