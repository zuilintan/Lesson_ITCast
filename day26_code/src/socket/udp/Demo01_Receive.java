package socket.udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @作者: LinTan
 * @日期: 2019/3/11 12:35
 * @版本: 1.0
 * @描述: //接收端(UDP)(应该首先启动接收端.反之会丢失数据)
 * 1.0: Initial Commit
 */

public class Demo01_Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(10001);//创建Socket相当于创建码头
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);//创建Packet相当于创建集装箱
        socket.receive(packet);//接货,接收数据

        byte[] arr = packet.getData();//获取数据
        int len = packet.getLength();//获取有效的字节个数
        System.out.println(new String(arr, 0, len));//取出arr中从0开始到len的字节转换为字符串
        socket.close();
    }
}
