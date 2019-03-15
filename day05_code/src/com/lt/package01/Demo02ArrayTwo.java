package com.lt.package01;

public class Demo02ArrayTwo {
    public static void main(String[] args) {
        int[] arrayOne = new int[3];
        System.out.println(arrayOne);
        System.out.println(arrayOne[0]);
        System.out.println(arrayOne[1]);
        System.out.println(arrayOne[2]);

        arrayOne[1] = 10;
        arrayOne[2] = 20;
        System.out.println(arrayOne);
        System.out.println(arrayOne[0]);
        System.out.println(arrayOne[1]);
        System.out.println(arrayOne[2]);


        int[] arrayTwo = new int[3];
        System.out.println(arrayTwo);
        System.out.println(arrayTwo[0]);
        System.out.println(arrayTwo[1]);
        System.out.println(arrayTwo[2]);

        arrayTwo[1] = 10;
        arrayTwo[2] = 20;
        System.out.println(arrayTwo);
        System.out.println(arrayTwo[0]);
        System.out.println(arrayTwo[1]);
        System.out.println(arrayTwo[2]);


        int[] arrayThree = arrayTwo;
        System.out.println(arrayThree);
        System.out.println(arrayThree[0]);
        System.out.println(arrayThree[1]);
        System.out.println(arrayThree[2]);

        arrayThree[1] = 10;
        arrayThree[2] = 20;
        System.out.println(arrayThree);
        System.out.println(arrayThree[0]);
        System.out.println(arrayThree[1]);
        System.out.println(arrayThree[2]);
    }
}
