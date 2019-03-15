package test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @作者: LinTan
 * @日期: 2019/3/4 17:54
 * @版本: 1.0
 * @描述: //键盘录入一个int型整数，对其求二进制表现形式
 * 1.0: Initial Commit
 * <p>
 * 需求:
 * 若录入的整数过大，给予提示
 * 若录入的是小数，给予提示
 * 若录入的是其它字符，给予提示
 * 分析:
 * 1, 创建键盘录入对象
 * 2, 将录入结果存储在String中(因为若存储为int型，如有不符合条件的情况就直接报错，无法进行后续判断)
 * 3, 键盘录入的结果转换成int型数据
 * 4, 判断真假。true就直接转换。false就对应的进行判断
 * </p>
 */

public class Test02 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数: ");
        while (true) {
            String s1 = sc.nextLine();
            try {
                int parseInt = Integer.parseInt(s1);
                String s2 = Integer.toBinaryString(parseInt);
                System.out.println(s2);
                break;
            } catch (Exception e) {
                try {
                    new BigInteger(s1);
                    System.out.println("录入错误，你录入的是一个过大的整数");
                } catch (Exception e1) {
                    try {
                        new BigDecimal(s1);
                        System.out.println("录入错误，你录入的是一个小数");
                    } catch (Exception e2) {
                        System.out.println("录入错误，你录入的是一个非法字符");
                    }
                }
            }
        }
    }
}
