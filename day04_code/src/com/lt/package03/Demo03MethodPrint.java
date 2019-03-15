package com.lt.package03;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }

    private static void printCount(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld" + (i + 1));
        }
    }
}
