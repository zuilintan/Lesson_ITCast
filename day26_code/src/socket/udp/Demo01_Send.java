package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @作者: LinTan
 * @日期: 2019/3/11 12:26
 * @版本: 1.0
 * @描述: //发送端(UDP)
 * 1.0: Initial Commit
 */

public class Demo01_Send {
    public static void main(String[] args) throws IOException {
        String str = "what are you 弄啥呢?";
        DatagramSocket socket = new DatagramSocket();//创建Socket相当于创建码头,端口号可以不指定,默认随机生成
        DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 10001);//创建Packet相当于集装箱
        socket.send(packet);//发货,将数据发送出去
        socket.close();//关闭码头
    }
}
