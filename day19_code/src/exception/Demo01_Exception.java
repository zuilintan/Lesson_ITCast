package exception;

/**
 * @作者: LinTan
 * @日期: 2019/3/3 10:58
 * @版本: 1.0
 * @描述: 异常，程序在运行期出现的错误
 * 1.0: Initial Commit
 * <p>
 * 分类:
 * 1.Error(错误): 非重点，一般有服务器宕机， 数据库崩溃
 * 2.Exception(异常): 主要讲RuntimeException
 * <p>
 * 体系:
 * Throwable
 * * Error
 * * Exception
 * * * * 其它(编译时异常): Java程序必须显式处理，否则程序就会发生错误，无法通过编译
 * * * * RuntimeException(运行时异常): 无需显式处理，也可以和编译时异常一样处理，程序员犯的错误
 * </P>
 */

public class Demo01_Exception {

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        /*arr=null;
        System.out.println(arr[1]);//NullPointerException*/
        //System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
    }
}