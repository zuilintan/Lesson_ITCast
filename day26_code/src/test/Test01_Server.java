package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @作者: LinTan
 * @日期: 2019/3/11 22:37
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 */

public class Test01_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10021);//1.创建serverSocket,并设置端口号
        System.out.println("服务器启动,绑定10021端口");//友好提示
        while (true) {
            Socket socket = serverSocket.accept();//2.接受客户端请求
            new Thread() {//3.新建一条线程
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//4.获取输入流,并包装
                        PrintStream ps = new PrintStream(socket.getOutputStream());//5.获取输出流,并包装
                        String line = br.readLine();//6.将客户端写过来的数据读取出来
                        line = new StringBuilder(line).reverse().toString();//7.涟水编程,先将字符串转换成字符串生成器,然后调用其reverse()反转,接着转回字符串,最后再赋值给line
                        ps.println(line);//8.将反转后的字符串写回去
                        socket.close();//9.关闭socket套接字,并同时关闭InputStream和OutputStream
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }

    }
}
