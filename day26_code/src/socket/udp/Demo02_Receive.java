package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @作者: LinTan
 * @日期: 2019/3/11 14:37
 * @版本: 1.0
 * @描述: //接收端(UDP传输优化,键盘录入)(应该首先启动接收端.反之会丢失数据)
 * 1.0: Initial Commit
 */

public class Demo02_Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(10002);//创建Socket相当于创建码头
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);//创建Packet相当于创建集装箱
        while (true) {
            socket.receive(packet);//接货,接收数据
            byte[] arr = packet.getData();//获取数据
            int len = packet.getLength();//获取有效的字节个数
            String ip = packet.getAddress().getHostAddress();//获取ip地址
            int port = packet.getPort();//获取端口号
            System.out.println(ip + ":" + port + ":" + new String(arr, 0, len));
        }
    }
}
