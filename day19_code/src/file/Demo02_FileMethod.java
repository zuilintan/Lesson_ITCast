package file;

import java.io.File;
import java.io.IOException;

/**
 * @作者: LinTan
 * @日期: 2019/3/5 0:02
 * @版本: 1.0
 * @描述: //File类的创建功能
 * 1.0: Initial Commit
 */

public class Demo02_FileMethod {
    public static void main(String[] args) throws IOException {
        method1();
        method2();

    }

    private static void method1() throws IOException {
        File file1 = new File("Test02.TXT");
        System.out.println(file1.createNewFile());//创建文件，若存在则不创建

        File file2 = new File("Test03");
        System.out.println(file2.createNewFile());

        System.out.println();
    }

    private static void method2() {
        File file1 = new File("Test04");
        System.out.println(file1.mkdir());//创建文件夹，若存在则不创建

        File file2 = new File("Test05.文件夹");
        System.out.println(file2.mkdir());//可以，但不推荐

        File file3 = new File("Test06\\Temp");
        System.out.println(file3.mkdirs());//创建多级文件夹，若存在则不创建
    }
}
