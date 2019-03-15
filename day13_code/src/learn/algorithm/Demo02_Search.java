package learn.algorithm;

/**
 * @作者: LinTan
 * @日期: 2019/2/17 18:28
 * @版本: 1.0
 * @描述: //数组查找算法
 * 1.0: Initial Commit
 */

public class Demo02_Search {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int i1 = binarySearch(arr, 22);
        int i2 = binarySearch(arr, 66);
        int i3 = binarySearch(arr, 88);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }

    /**
     * 二分查找
     * 前提: 数组有序
     * 特点:
     * <p>
     * eg: 查找22
     * 11, 22, 33, 44, 55, 66, 77
     * 11, 22, 33
     * rs: index为1
     * </p>
     */
    public static int binarySearch(int[] arr, int value) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;
        while (arr[mid] != value) {//当中间值等于要查找的值
            if (arr[mid] < value) {//当中间值小于要查找的值
                min = mid + 1;//改变最小值
            } else if (arr[mid] > value) {//当中间值大于要查找的值
                max = mid - 1;//改变最大值
            }
            mid = (min + max) / 2;//刷新中间值
            if (min > max) {//最小值大于最大值，说明查找完成，并未发现要查找的值
                return -1;
            }
        }
        return mid;
    }
}
