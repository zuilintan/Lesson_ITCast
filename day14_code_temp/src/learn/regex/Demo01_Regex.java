package learn.regex;

/**
 * @作者: LinTan
 * @日期: 2019/2/18 11:34
 * @版本: 1.0
 * @描述: //验证账号的规范性
 * 1.0: Initial Commit
 * 正则表达式: 指用一个用来描述或者匹配一系列符合某个说法规则的字符串中的单个字符串，其实就是一种规则，有特殊应用
 * 场景: 比如注册邮箱
 * <p>
 * 要求:
 * 1, 5~15位数字
 * 2, 0不能开头
 * 3, 必须是纯数字
 * </p>
 */

public class Demo01_Regex {
    public static void main(String[] args) {
        String userNumber = "012345";
        boolean b1 = checkAccount1(userNumber);
        boolean b2 = checkAccount2(userNumber);
        System.out.println(b1);
        System.out.println(b2);
    }

    /**
     * 普通方法实现
     */
    private static boolean checkAccount1(String userNumber) {
        boolean flag = true;//如果校验qq不符合要求就把flag置为false。如果符合要求直接返回
        if (userNumber.length() >= 5 && userNumber.length() <= 15) {
            if (!userNumber.startsWith("0")) {
                char[] arr = userNumber.toCharArray();//将字符串转换字符数组
                for (int i = 0; i < arr.length; i++) {
                    char ch = arr[i];//记录每一个字符
                    if (!(ch >= '0' && ch <= '9')) {
                        flag = false;//不是数字
                        break;
                    }
                }
            } else {
                flag = false;//以0开头，不符合qq标准
            }
        } else {
            flag = false;//长度不符合
        }
        return flag;
    }

    /**
     * 正则表达式实现
     */
    private static boolean checkAccount2(String userNumber) {
        String regex = "[1-9]\\d{4,14}";
        boolean b = userNumber.matches(regex);
        return b;
    }
}
