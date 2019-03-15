package test;

/**
 * @作者: LinTan
 * @日期: 2019/2/15 14:53
 * @版本: 1.0
 * @描述: //字符串中首字母大写，其余小写
 * 1.0: Initial Commit
 */

public class Test04 {
    public static void main(String[] args) {
        String s = "lintan";
        String s1 = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());//链式编程
        System.out.println(s1);
    }


}
