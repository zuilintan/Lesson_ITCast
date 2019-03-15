package test;

/**
 * @作者: LinTan
 * @日期: 2019/2/15 18:00
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 * <p>
 * 需求: 字符串A中查找字符串B
 * eg: 键盘录入"abcdefg"，查找"de"
 * rt: 输出结果: 1
 */

public class Test07 {
    public static void main(String[] args) {
        String s1 = "惊闻大家已经考完英语四六级，很多人准备明年再战，说起战，我就想起斗战胜佛，也就是孙悟空，明年年初，中美合拍的西游记即将正式开机，我继续扮演美猴王孙悟空，我会用美猴王艺术形象努力创造一个正能量的形象，文体两开花，弘扬中华文化，希望大家多多关注。";
        String s2 = "猴";
        int count = 0;//定义计数器
        int index = 0;//定义索引
        while ((index = s1.indexOf(s2)) != -1) {
            count++;
            s1 = s1.substring(index + s2.length());
        }
        System.out.println(count);
    }
}
