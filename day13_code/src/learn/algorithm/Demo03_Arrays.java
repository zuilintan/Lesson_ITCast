package learn.algorithm;

import java.util.Arrays;

public class Demo03_Arrays {

    public static void main(String[] args) {
        int[] arr1 = {33, 22, 11, 44, 66, 55};

        String s1 = Arrays.toString(arr1);
        System.out.println(s1);//数组转字符串

        Arrays.sort(arr1);//底层使用快速排序法
        String s2 = Arrays.toString(arr1);
        System.out.println(s2);//排序

        int[] arr2 = {11, 22, 33, 44, 55, 66};
        int i1 = Arrays.binarySearch(arr2, 22);//查找到，则返回索引值。若不存在，则返回(-可能会插入的位置)-1。可以借此反证位置。
        // 取负是表示该数不存在数组中，再-1是用来排除第0个位置的干扰，比如要查找9，而数组中0号索引对应的元素为11，那么9可能出现的位置就是0，但0取负还是0，和11冲突，所以再-1，排除干扰
        int i2 = Arrays.binarySearch(arr2, 66);
        int i3 = Arrays.binarySearch(arr2, 9);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
