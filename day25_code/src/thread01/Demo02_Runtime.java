package thread01;

import java.io.IOException;

/**
 * @作者: LinTan
 * @日期: 2019/3/9 11:36
 * @版本: 1.0
 * @描述: //Runtime类
 * 1.0: Initial Commit
 */

public class Demo02_Runtime {
    public static void main(String[] args) throws IOException {
        //Runtime r = new Runtime();//无法实例化，因为其构造方法被private化
        Runtime r = Runtime.getRuntime();//获取运行时对象
        //r.exec("shutdown -s -t 300");//关机，定时300S以后
        r.exec("shutdown -a");//关机，取消

    }
}
