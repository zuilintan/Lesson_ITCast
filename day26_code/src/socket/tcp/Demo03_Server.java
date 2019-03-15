package socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @作者: LinTan
 * @日期: 2019/3/11 16:52
 * @版本: 1.0
 * @描述: //服务端(TCP优化,省略中间字节数组,并使用多线程)
 * 1.0: Initial Commit
 */

public class Demo03_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10011);

        while (true) {
            Socket socket = serverSocket.accept();//接受客户端请求
            new Thread() {
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//将字节流包装成了字符流
                        PrintStream ps = new PrintStream(socket.getOutputStream());//推荐,PrintStream中有换行的方法

                        //A
                        ps.println("欢迎咨询黑马程序员");//必须是println,因为客户端的readLine()读取是以/r/n为结束标记的,没有换行就一直在读取,下一行代码永远执行不到

                        //B
                        System.out.println(br.readLine());
                        ps.println("不好意思,爆满了");

                        //C
                        System.out.println(br.readLine());
                        ps.println("抱歉");
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
