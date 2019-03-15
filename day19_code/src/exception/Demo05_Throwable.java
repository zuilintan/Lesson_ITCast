package exception;

/**
 * @作者: LinTan
 * @日期: 2019/3/3 12:45
 * @版本: 1.0
 * @描述: 可抛出的
 * 1.0: Initial Commit
 * <p>
 * Throwable的常见方法
 * 1.getMessage(): 获取异常信息，返回字符串
 * 2.toString(): 获取异常类名和异常信息，返回字符串
 * 3.printStackTrace(): 获取异常类名和异常信息，以及异常出现在程序中的位置，返回值为void
 * </p>
 */

public class Demo05_Throwable {

    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());//异常信息
            System.out.println(e.toString());//白字，异常类名+异常信息
            System.out.println(e);//同上，异常类名+异常信息
            e.printStackTrace();//红字，JVM默认方式，异常类名+异常信息+异常出现的位置
        }
    }
}
