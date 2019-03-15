package file;

import java.io.File;

/**
 * @作者: LinTan
 * @日期: 2019/3/5 16:10
 * @版本: 1.0
 * @描述: //重命名和删除功能
 * 1.0: Initial Commit
 */

public class Demo03_FileMethod {

    public static void main(String[] args) {
        method1();//若路径名相同，就改名。若不同，就是改名并移动
        method2();
    }

    private static void method1() {
        File file1 = new File("Test03");
        File file2 = new File("Test03.txt");
        System.out.println(file1.renameTo(file2));


        File file3 = new File("Test03.txt");
        File file4 = new File("C:\\Users\\LinTan\\IdeaProjects\\Lesson_ITCast\\Test06\\Test03.txt");
        System.out.println(file3.renameTo(file4));
    }

    private static void method2() {
        File file1 = new File("Test02.TXT");
        System.out.println(file1.delete());//小心，Java删除不走回收站

        File file2 = new File("Test05.文件夹");
        System.out.println(file2.delete());

        File file3 = new File("Test06");
        System.out.println(file3.delete());//若要删除一个文件夹，需要其中不包含文件和文件夹
    }
}
