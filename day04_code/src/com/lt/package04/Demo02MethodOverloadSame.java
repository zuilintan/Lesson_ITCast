package com.lt.package04;

public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));
        System.out.println(isSame((short) a, (short) b));
        System.out.println(isSame(10, 20));
        System.out.println(isSame(10L, 20L));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("两个byte参数的方法");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("两个short参数的方法");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个int参数的方法");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("两个long参数的方法");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
