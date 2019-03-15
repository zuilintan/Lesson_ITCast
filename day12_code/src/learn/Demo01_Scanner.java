package learn;

import java.util.Scanner;

public class Demo01_Scanner {//类名不要和Scanner同名，就近原则

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);//键盘录入
        int i = scanner.nextInt();
        System.out.println(i);*/

        /*while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("输入类型正确，值为：" + i);
            } else {
                string s = scanner.nextLine();//遇回车（/r/n）即结束
                System.out.println("输入类型错误，值为：" + s);
            }
        }*/

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s1 = scanner.nextLine();
            System.out.println("s1值为：" + s1);
            String s2 = scanner.nextLine();
            System.out.println("s2值为：" + s2);
        }


    }

}
