package test;

import java.util.Scanner;

/**
 * @作者: LinTan
 * @日期: 2019/2/15 16:56
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 * <p>
 * 需求: 将字符串反转
 * eg: 键盘录入"abc"
 * rt: 输出结果"cba"
 * 分析:
 * * A, 键盘录入获取字符串(Scanner)
 * * B, 将字符串转换成字符数组(toCharArray())
 * * C, 倒序遍历字符数组，并再次拼接字符串(+或者concat())
 * * D, 打印
 */

public class Test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = scanner.nextLine();
        char[] arr = line.toCharArray();
        String string = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            string += arr[i];
        }
        System.out.println(string);
    }
}
