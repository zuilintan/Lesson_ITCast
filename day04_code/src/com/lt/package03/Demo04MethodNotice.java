package com.lt.package03;

public class Demo04MethodNotice {
    public static int method01() {
        return 10;
    }

    public static void method02() {
        return;
    }

    public static void method03() {
        System.out.println("AAA");
        System.out.println("BBB");
        return;//可略
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
