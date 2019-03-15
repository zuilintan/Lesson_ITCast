package com.lt.package03;

public class Demo02MethodSum {

    public static void main(String[] args) {
        int sum = getSum();
        System.out.println(sum);
    }

    private static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum+=i;
        }
        return sum;
    }
}
