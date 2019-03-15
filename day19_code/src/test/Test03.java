package test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @作者: LinTan
 * @日期: 2019/3/6 11:18
 * @版本: 1.0
 * @描述: //判断指定目录下是否有指定后缀名的文件，若有，就输出该文件名称
 * 1.0: Initial Commit
 */

public class Test03 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        File dir = new File("E:\\Media\\Gallery\\表情包\\Bronya");

        String[] arr1 = dir.list();
        for (String s : arr1) {
            if (s.endsWith(".png")) {
                System.out.println(s);
            }
        }

        System.out.println("-----------------------------------------------------------------------------");

        File[] arr2 = dir.listFiles();//推荐，可以遍历N多层
        for (File file : arr2) {
            if (file.isFile() && file.getName().endsWith(".png")) {
                System.out.println(file);
            }
        }

        System.out.println("-----------------------------------------------------------------------------");

        String[] arr3 = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir, name);
                boolean b = file.isFile() && file.getName().endsWith(".png");
                return b;
            }
        });
        for (String s : arr3) {
            System.out.println(s);
        }
    }
}
