package test;

/**
 * @作者: LinTan
 * @日期: 2019/2/15 14:59
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 * <p>
 * 需求: 将数组中的数据按照指定格式拼接成一个字符串
 * eg: int[] arr = {1, 2, 3};
 * rt: "[1, 2, 3]"
 * 分析:
 * * A, 需要定义一个字符串"["
 * * B, 遍历数组获取每一个元素
 * * C, 用字符串与数组中的元素进行拼接
 */

public class Test05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s1 = "[";
        String s2 = "]";
        String s3 = ", ";
        for (int i = 0; i < arr.length; i++) {
            s1 += arr[i];//append等同于+=
            if (i == arr.length - 1) {
                s1 += s2;
            } else {
                s1 += s3;
            }
        }
        System.out.println(s1);
    }
}
