package file;

import java.io.File;
import java.io.IOException;

/**
 * @作者: LinTan
 * @日期: 2019/3/5 16:33
 * @版本: 1.0
 * @描述: //判断功能
 * 1.0: Initial Commit
 */

public class Demo04_FileMethod {
    public static void main(String[] args) throws IOException {
        method1();
        method2();
        method3();
    }

    private static void method1() {
        File dir1 = new File("Test06");
        System.out.println(dir1.isDirectory());
        System.out.println(dir1.isFile());

        File dir2 = new File("Test01.txt");
        System.out.println(dir2.isDirectory());
        System.out.println(dir2.isFile());

        System.out.println();
    }

    private static void method2() {
        File file1 = new File("Test01.txt");
        file1.setReadable(false);//设置是否可读
        System.out.println(file1.canRead());//Windows认为所有的文件都是可读的，所以返回true。若换成Linux则返回false

        file1.setWritable(false);//设置是否可写
        System.out.println(file1.canWrite());

        System.out.println();
    }

    private static void method3() throws IOException {
        File file1 = new File("Test09.txt");
        System.out.println(file1.createNewFile());
        System.out.println(file1.isHidden());
    }
}
