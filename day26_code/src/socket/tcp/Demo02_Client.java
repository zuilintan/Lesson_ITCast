package socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @作者: LinTan
 * @日期: 2019/3/11 16:51
 * @版本: 1.0
 * @描述: //客户端(TCP优化,省略中间字节数组)
 * 1.0: Initial Commit
 */

public class Demo02_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10011);

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//将字节流包装成了字符流
        //BufferedWriter bw = new BufferedWriter();//不推荐,ReadLine()以/r/n为结束标记,所以一定要自己写一个换行,即调用一个newLine()
        PrintStream ps = new PrintStream(socket.getOutputStream());//推荐,PrintStream中有换行的方法println()

        //A
        System.out.println(br.readLine());
        ps.println("我想报名黑马程序员");

        //B
        System.out.println(br.readLine());
        ps.println("大哭!!能不能给次机会?");

        //C
        System.out.println(br.readLine());

        socket.close();
    }
}
