package test;

/**
 * @作者: LinTan
 * @日期: 2019/2/15 12:17
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 * 需求: 统计一个字符串中大小写字母、数字及其它符号出现的次数
 * 分析:
 * * A, 字符串是由字符组成的，而字符都是有范围的，通过范围判断是否包含该字符(ASCII或Unicode)
 * * B, 如果包含就让步进语句自增(计数器思想for{if(){}})
 */

public class Test03 {
    private static final String STRING = "LinTan";

    public static void main(String[] args) {
        int big = 0;
        int small = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < STRING.length(); i++) {//通过for循环获取索引
            char c = STRING.charAt(i);//通过索引获取字符
            if (c >= 'A' && c <= 'Z') {
                big++;
            } else if (c >= 'a' && c <= 'z') {
                small++;
            } else if (c >= '0' && c <= '9') {
                num++;
            } else {
                other++;
            }
        }
        System.out.println(STRING + "中，");
        System.out.println("大写字母有：" + big + "个。");
        System.out.println("小写字母有：" + small + "个。");
        System.out.println("数字有：" + num + "个。");
        System.out.println("其它有：" + other + "个。");
    }
}
