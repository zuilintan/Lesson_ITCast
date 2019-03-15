package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @作者: LinTan
 * @日期: 2019/3/11 15:17
 * @版本: 1.0
 * @描述: //接收端(UDP传输多线程)
 * 1.0: Initial Commit
 */

public class Demo03_MoreThread {
    public static void main(String[] args) throws InterruptedException {
        new Receive().start();
        Receive.sleep(100);
        new Send().start();
    }
}

class Receive extends Thread {
    @Override
    public void run() {//run()中不能抛异常
        try {
            DatagramSocket socket = new DatagramSocket(10003);//创建Socket相当于创建码头
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);//创建Packet相当于创建集装箱
            while (true) {
                socket.receive(packet);//接货,接收数据
                byte[] arr = packet.getData();//获取数据
                int len = packet.getLength();//获取有效的字节个数
                String ip = packet.getAddress().getHostAddress();//获取ip地址
                int port = packet.getPort();//获取端口号
                System.out.println(ip + ":" + port + ":" + new String(arr, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Send extends Thread {
    @Override
    public void run() {
        try {
            DatagramSocket socket = new DatagramSocket();//创建Socket相当于创建码头
            Scanner sc = new Scanner(System.in);//获取键盘录入对象
            while (true) {
                String line = sc.nextLine();//获取键盘录入的字符串
                if ("quit".equals(line)) {
                    break;
                }
                DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 10003);//创建Packet相当于集装箱
                socket.send(packet);//发货,将数据发出去
            }
            socket.close();//关闭码头
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}