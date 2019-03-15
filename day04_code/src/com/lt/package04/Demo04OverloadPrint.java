package com.lt.package04;

public class Demo04OverloadPrint {
    public static void main(String[] args) {
        myPrint(100);
        myPrint("Hello");
    }

    public static void myPrint(byte num) {
        System.out.println(num);
    }

    public static void myPrint(short num) {
        System.out.println(num);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }

    public static void myPrint(long num) {
        System.out.println(num);
    }

    public static void myPrint(float num) {
        System.out.println(num);
    }

    public static void myPrint(double num) {
        System.out.println(num);
    }

    public static void myPrint(char num) {
        System.out.println(num);
    }

    public static void myPrint(boolean b) {
        System.out.println(b);
    }

    public static void myPrint(String str) {
        System.out.println(str);
    }
}
