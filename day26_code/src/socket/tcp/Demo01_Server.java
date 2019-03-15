package socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @作者: LinTan
 * @日期: 2019/3/11 16:52
 * @版本: 1.0
 * @描述: //服务端(TCP)
 * 1.0: Initial Commit
 */

public class Demo01_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10011);
        Socket socket = serverSocket.accept();//接受客户端请求

        InputStream is = socket.getInputStream();//获取客户端输入流(听筒)
        OutputStream os = socket.getOutputStream();//获取客户端输出流(麦克风)

        //A,发
        os.write("百度一下,你就知道".getBytes());//服务端向客户端写出数据


        //B,收
        byte[] arr = new byte[1024];
        int len = is.read(arr);//读取客户端发来的数据
        System.out.println(new String(arr, 0, len));//将数据转换成字符串并打印


        socket.close();
        serverSocket.close();//关闭服务器,不推荐
    }
}
