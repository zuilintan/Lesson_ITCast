package exception;

/**
 * @作者: LinTan
 * @日期: 2019/3/3 11:30
 * @版本: 1.0
 * @描述: 异常处理
 * 1.0: Initial Commit
 * <p>
 * 处理异常的两种方式:
 * 1.默认处理(将异常交给JVM处理): 将异常的名称、位置等信息打印到控制台上，同时强行停止程序
 * 2.自定义处理(try catch等):
 * a.try catch
 * b.try catch finally
 * c.try finally
 * d.throws
 * <p>
 * try: 检测异常
 * catch: 捕获异常
 * finally: 释放资源(关闭IO流和数据库等)
 * </p>
 */

public class Demo02_Exception {

    public static void main(String[] args) {
        Demo01 d = new Demo01();
        try {

            int i = d.div(10, 0);
            System.out.println(i);
        } catch (ArithmeticException a) {//ArithmeticException a = new ArithmeticException();
            System.out.println("出错了，除数为零了");
        }
        System.out.println("异常处理结束，继续执行ing");
    }
}

class Demo01 {
    public int div(int a, int b) {
        return a / b;
    }
}
