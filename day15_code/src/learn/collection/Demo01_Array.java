package learn.collection;

import bean.Student;

public class Demo01_Array {
    public static void main(String[] args) {
        //int[] arr = new int[5];//基本类型数据
        Student[] arr = new Student[5];//创建引用类型数组
        arr[0] = new Student("张三", 23);//创建一个学生对象，存储在数组的第一个位置
        arr[1] = new Student("李四", 24);
        arr[2] = new Student("王五", 25);
        printArray(arr);
        System.out.println(arr);
    }

    private static void printArray(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
