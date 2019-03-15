package file;

import java.io.File;

/**
 * @作者: LinTan
 * @日期: 2019/3/4 23:33
 * @版本: 1.0
 * @描述: //File的3个构造方法
 * 1.0: Initial Commit
 */

public class Demo01_File {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    private static void method1() {
        File file1 = new File("C:\\Users\\LinTan\\IdeaProjects\\Lesson_ITCast\\Test01.txt");
        boolean b1 = file1.exists();
        System.out.println(b1);
        System.out.println();

        File file2 = new File("Test01.txt");
        boolean b2 = file2.exists();
        System.out.println(b2);
        System.out.println();

        File file3 = new File("T.txt");
        boolean b3 = file3.exists();
        System.out.println(b3);
        System.out.println();
    }

    private static void method2() {
        String parent = "C:\\Users\\LinTan\\IdeaProjects\\Lesson_ITCast";
        String child = "Test01.txt";
        File file = new File(parent, child);
        boolean b1 = file.exists();
        System.out.println(b1);
        System.out.println();
    }

    private static void method3() {
        File parent = new File("C:\\Users\\LinTan\\IdeaProjects\\Lesson_ITCast");
        String child = "Test01.txt";
        File file = new File(parent, child);
        System.out.println(file.exists());
        System.out.println(parent.exists());
        System.out.println();
    }
}
