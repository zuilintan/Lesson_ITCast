package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @作者: LinTan
 * @日期: 2019/3/3 12:36
 * @版本: 1.0
 * @描述: 编译时异常与运行时异常
 * 1.0: Initial Commit
 * <p>
 * 编译时异常: 编译某个程序时，可能出现这样那样的事发生。比如文件找不到，这样的异常必须要在编译时处理(未雨绸缪)
 * 运行时异常: 程序员犯的错误，需要回来修改代码
 * </P>
 */

public class Demo04_Exception {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("xxx.txt");//文件输入流，xxx.txt可能不存在。
        } catch (FileNotFoundException e) {

        }
    }
}
