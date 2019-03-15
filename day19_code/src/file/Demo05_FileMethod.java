package file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @作者: LinTan
 * @日期: 2019/3/6 10:34
 * @版本: 1.0
 * @描述: //获取功能
 * 1.0: Initial Commit
 */

public class Demo05_FileMethod {
    public static void main(String[] args) throws IOException {
        method1();
        method2();
    }

    private static void method1() throws IOException {
        File file1 = new File("Test10.txt");
        File file2 = new File("C:\\Users\\LinTan\\IdeaProjects\\Lesson_ITCast\\Test10.txt");
        System.out.println(file1.createNewFile());

        System.out.println(file1.getAbsolutePath());//获取绝对路径
        System.out.println(file2.getAbsolutePath());//获取绝对路径

        System.out.println(file1.getPath());//获取构造方法传入的pathname
        System.out.println(file2.getPath());

        System.out.println(file1.getName());//获取文件或文件夹的名称
        System.out.println(file2.getName());

        System.out.println(file1.length());//获取文件字节个数
        System.out.println(file2.length());

        Date date1 = new Date(file1.lastModified());//获取最后一次修改的修改时间，毫秒值。并通过Date的构造方法解读
        System.out.println(date1);
        Date date2 = new Date(file2.lastModified());
        System.out.println(date2);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日, HH:mm:ss");
        System.out.println(sdf1.format(date1));//将解读后的时间格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日, HH:mm:ss");
        System.out.println(sdf2.format(date2));

        System.out.println();
    }

    private static void method2() {
        File dir = new File("C:\\Users\\LinTan\\IdeaProjects\\Lesson_ITCast");
        String[] arr1 = dir.list();//获取指定目录下的所有文件或者文件夹的名称数组。仅是为了获取文件名
        for (String s : arr1) {
            System.out.println(s);
        }

        System.out.println("---------------------------------------------------------------------");

        File[] arr2 = dir.listFiles();//获取指定目录下的所有文件或者文件夹的File数组。获取文件对象，可以使用更多的功能对其操作
        for (File f : arr2) {
            System.out.println(f);//之所以打印出全路径，是因为File类重写了Object类的toString()
        }
    }
}
