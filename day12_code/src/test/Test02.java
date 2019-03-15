package test;

/**
 * @作者: LinTan
 * @日期: 2019/2/15 12:13
 * @版本: 1.0
 * @描述: //遍历字符串
 * 1.0: Initial Commit
 */

public class Test02 {
    private static final String STRING = "LinTan";

    public static void main(String[] args) {
        for (int i = 0; i < STRING.length(); i++) {//通过for循环获取索引
            char c = STRING.charAt(i);
            System.out.println(c);//通过索引获取字符
        }
    }
}
