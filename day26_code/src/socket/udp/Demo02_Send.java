package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @作者: LinTan
 * @日期: 2019/3/11 14:35
 * @版本: 1.0
 * @描述: //发送端(UDP传输优化,键盘录入)
 * 1.0: Initial Commit
 */

public class Demo02_Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();//创建Socket相当于创建码头
        Scanner sc = new Scanner(System.in);//获取键盘录入对象
        while (true) {
            String line = sc.nextLine();//获取键盘录入的字符串
            if ("quit".equals(line)) {
                break;
            }
            DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 10002);//创建Packet相当于集装箱
            socket.send(packet);//发货,将数据发出去
        }
        socket.close();//关闭码头
    }
}
