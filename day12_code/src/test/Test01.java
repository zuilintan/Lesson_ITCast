package test;

import java.util.Scanner;

/**
 * @作者: LinTan
 * @日期: 2019/2/14 18:03
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 * <p>
 * 需求: 模拟登陆，三次机会，附带提示
 * 分析:
 * * A, 键盘录入(Scanner)
 * * B, 三次输入密码机会(for)
 * * C, 并提示剩余次数(if)
 */

public class Test01 {
    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "0";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名: ");
            String inUserName = scanner.nextLine();
            System.out.println("请输入密码: ");
            String inPassWord = scanner.nextLine();
            if (USERNAME.equals(inUserName) && PASSWORD.equals(inPassWord)) {//尽可能用常量.equals()，因为变量可能为null，null.equals()会报空指针异常
                System.out.println("欢迎" + inUserName + "登陆");
                break;
            }//null.equals()报空指针异常的原因: 因为null值，并不是一个String对象。通过声明为String类型的引用，去调用了String对象的方法。自然不行
            else {
                if (i == 2) {
                    System.out.println("你的输入次数已达上限");
                } else {
                    System.out.println("用户名或密码错误，还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}
