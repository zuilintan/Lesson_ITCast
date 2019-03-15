package test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @作者: LinTan
 * @日期: 2019/3/13 8:26
 * @版本: 1.0
 * @描述: //服务端(TCP上传文件)
 * 1.0: Initial Commit
 * <p>
 * 3.建立多线程的服务器
 * 4.读取文件名
 * 5.判断文件名是否存在,将结果发回客户端
 * 8.定义FileOutputStream,从网络读取数据,存储到本地
 * </p>
 */

public class Test02_UploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10041);
        System.out.println("服务器已启动,绑定" + serverSocket.getLocalPort() + "端口号");
        while (true) {
            Socket socket = serverSocket.accept();//接受请求
            new Thread() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        PrintStream ps = new PrintStream(socket.getOutputStream());
                        String fileName = br.readLine();//读取文件名
                        File dir = new File("upload");
                        dir.mkdir();//创建文件夹,用来存储上传来的文件
                        File file = new File(dir, fileName);//创建File对象
                        if (file.exists()) {//如果服务器已存在同名文件
                            ps.println("存在");//将存在返回客户端
                            socket.close();//关闭socket
                            return;
                        } else {
                            ps.println("不存在");
                            byte[] bytes = new byte[1024];
                        }

                        FileOutputStream fos = new FileOutputStream(file);
                        byte[] arr = new byte[8192];
                        int len;
                        while ((len = is.read(arr)) != -1) {
                            fos.write(arr, 0, len);
                        }
                        fos.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
