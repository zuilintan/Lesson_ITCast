package test;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @作者: LinTan
 * @日期: 2019/3/13 8:27
 * @版本: 1.0
 * @描述: //客户端(TCP上传文件)
 * 1.0: Initial Commit
 * <p>
 * 1.提示输入要上传的文件路径,验证路径是否存在以及是否是文件夹
 * 2.发送文件名到服务端(服务端要判断是否存在)
 * 6.接收结果,
 * 7.如果存在则给予提示,程序直接退出
 * 8.如果不存在,定义FileInputStream读取文件,写出到网络
 * </p>
 */

public class Test02_UploadClient {
    public static void main(String[] args) throws IOException {
        File file = getFile();
        Socket socket = new Socket("127.0.0.1", 10041);//创建客户端码头
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream ps = new PrintStream(socket.getOutputStream());//PrintStream即可以写字符串也可以写字节,如果用BufferedWriter就只能写字符串
        ps.println(file.getName());//把文件名发送给服务端
        String result = br.readLine();
        if ("存在".equals(result)) {
            System.out.println("文件已存在,请不要重复上传");
            socket.close();
            return;
        } else {
            FileInputStream fis = new FileInputStream(file);
            byte[] arr = new byte[8192];
            int len;
            while ((len = fis.read(arr)) != -1) {//将fis中内容写到arr中,只要有内容,就不为-1
                ps.write(arr, 0, len);//切记不要用ps.println(),因为它会将字节转换为字符串
            }
            fis.close();
            socket.close();
        }
    }

    private static File getFile() {
        Scanner sc = new Scanner(System.in);//创建键盘录入对象
        System.out.println("请输入一个文件路径:");
        while (true) {
            String line = sc.nextLine();
            File file = new File(line);//封装成File对象
            if (!file.exists()) {
                System.out.println("文件路径不存在,请重新录入:");
            } else if (file.isDirectory()) {
                System.out.println("录入有误,请不要录入文件夹路径");
            } else {
                return file;
            }
        }
    }
}
