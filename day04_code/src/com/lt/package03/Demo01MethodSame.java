package com.lt.package03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10, 20));
        System.out.println(isSame(10, 10));
    }

    private static boolean isSame(int a, int b) {
        return a == b;
    }
}
