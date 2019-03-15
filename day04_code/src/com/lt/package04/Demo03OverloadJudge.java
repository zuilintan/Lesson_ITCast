package com.lt.package04;

public class Demo03OverloadJudge {
    public static void open() {}
    public static void open(int a) {}
    static void open(int a, int b) {}
    public static void open(double a, int b) {}
    public static void open(int a, double b) {}
    //public void open(int i, double d) {}//和第8行冲突
    //public static void OPEN() {}//非重载
    //public static void open(int i, int j) {}//和第6行冲突
}
