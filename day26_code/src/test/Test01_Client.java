package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @作者: LinTan
 * @日期: 2019/3/11 22:36
 * @版本: 1.0
 * @描述: //客户端向服务器写字符串(键盘录入),服务器(多线程)将字符串反转后写回,客户端再次读取到反转后的字符串
 * 1.0: Initial Commit4
 * <p>
 * 输入流用来读,输出流用来写
 * </p>
 */

public class Test01_Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);//1.创建键盘录入对象
        Socket socket = new Socket("127.0.0.1", 10021);//2.创建一个Socket,指定ip和端口号
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//3.获取输入流,并包装
        PrintStream ps = new PrintStream(socket.getOutputStream());//4.获取输出流,并包装
        ps.println(sc.nextLine());//5.将键盘录入的结果发送出去
        System.out.println(br.readLine());//6.将反转后的结果读出来
        socket.close();//7.关闭socket套接字,并同时关闭InputStream和OutputStream
    }
}
