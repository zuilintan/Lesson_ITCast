package com.lt.package02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(10, 20);
        System.out.println("返回值是: " + num);

        printSum(100, 200);
    }

    private static int getSum(int a, int b) {
        return a + b;
    }

    private static void printSum(int a, int b) {
        int result = a + b;
        System.out.println("结果是: " + result);
    }
}
