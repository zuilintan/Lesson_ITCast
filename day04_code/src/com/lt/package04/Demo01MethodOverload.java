package com.lt.package04;

public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
    }

    private static int sum(int a, int b) {
        System.out.println("两个参数");
        return a + b;
    }

    private static int sum(int a, int b, int c) {
        System.out.println("三个参数");
        return a + b + c;
    }

    private static int sum(int a, int b, int c, int d) {
        System.out.println("四个参数");
        return a + b + c +d;
    }
}
