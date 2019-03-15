package learn.algorithm;

/**
 * @作者: LinTan
 * @日期: 2019/2/17 11:28
 * @版本: 1.0
 * @描述: //数组排序算法
 * 1.0: Initial Commit
 */

public class Demo01_Sort {
    public static void main(String[] args) {
        int[] arr1 = {24, 69, 80, 57, 13};
        int[] arr2 = {24, 69, 80, 57, 13};
        int[] arr3 = {24, 69, 80, 57, 13};

        bubbleSort(arr1);//冒泡排序
        printArray(arr1);

        selectionSort(arr2);//选择排序
        printArray(arr2);
    }

    /**
     * 冒泡排序
     * 特点: 轻的上浮，沉的下降
     * 用法: 相邻位置元素两两比较，若前面元素比后面的大，就换位置(将大数移后)
     * <p>
     * 0 1, 1 2, 2 3, 3 4
     * 0 1, 1 2, 2 3
     * 0 1, 1 2
     * 0 1
     * </p>
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//5个数比较4次即可，即arr.length-1次
            for (int j = 0; j < arr.length - 1 - i; j++) {//为防止下方arr[j + 1]出现数组越界，此处j < arr.length - 1，再减i是因为后面的数无需比较
                if (arr[j] > arr[j + 1]) {
                    exchangeElement(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 选择排序
     * 特点: 小的置前，大的置后
     * 用法: 按次序挑出元素与后面元素依次比较
     * <p>
     * 0    1, 2, 3, 4
     * 1    2, 3, 4
     * 2    3, 4
     * 3    4
     * </p>
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    exchangeElement(arr, i, j);
                }
            }
        }
    }

    private static void exchangeElement(int[] arr, int a, int b) {
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }//数组的元素交换

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }//数组的遍历输出
}
