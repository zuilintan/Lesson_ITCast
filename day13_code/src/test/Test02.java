package test;

import java.util.Scanner;

/**
 * @作者: LinTan
 * @日期: 2019/2/16 16:05
 * @版本: 1.0
 * @描述: //字符串反转
 * 1.0: Initial Commit
 */

public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入内容，程序将对其反转：");
        Scanner sc = new Scanner(System.in);
        String stringIn = sc.nextLine();
        String stringReverse = getStringReverse(stringIn);
        System.out.println(stringReverse);
    }

    private static String getStringReverse(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return sb.toString();
    }
}
