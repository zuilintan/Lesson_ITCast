package com.lt.package02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        sum(1,2);//单独调用

        System.out.println(sum(10,20));//打印调用

        int number = sum(100, 200);//赋值调用
        number+=100;
        System.out.println(number);
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}
