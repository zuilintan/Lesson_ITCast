package com.lt.package02;

public class Demo03MethodParam {
    public static void main(String[] args) {
        method01(10, 20);
        method02();
    }

    public static void method01(int a, int b) {
        int result = a * b;
        System.out.println("结果是: " + result);
    }

    public static void method02() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld" + i);
        }
    }
}
