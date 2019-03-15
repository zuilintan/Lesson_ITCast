package socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @作者: LinTan
 * @日期: 2019/3/11 16:51
 * @版本: 1.0
 * @描述: //客户端(TCP)
 * 1.0: Initial Commit
 */

public class Demo01_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10011);

        InputStream is = socket.getInputStream();//获取客户端输入流(听筒)
        OutputStream os = socket.getOutputStream();//获取客户端输出流(麦克风)

        //A,收
        byte[] arr = new byte[1024];
        int len = is.read(arr);//读取服务器发来的数据
        System.out.println(new String(arr, 0, len));//将数据转换成字符串并打印

        //B,发
        os.write("学习挖掘机哪家强".getBytes());//客户端向服务端写数据


        socket.close();
    }
}
