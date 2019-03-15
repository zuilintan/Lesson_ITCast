package learn.jdk5;

/**
 * @作者: LinTan
 * @日期: 2019/2/22 19:38
 * @版本: 1.0
 * @描述: 可以改变的
 * 1.0: Initial Commit
 * <p>
 * 格式: 修饰符 返回值类型 方法名 (数据类型 ... 变量名) {}
 * 注意: 这里的变量其实是一个数组
 * 若一个方法的形参有可变参数，并且还有多个参数。那么可变参数一定要写在最后一个
 * </p>
 */

public class Demo03_ChangeableArgs {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        print1(arr);
        print2(arr);
        print2(22);
    }

    private static void print1(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }

    private static void print2(int... arr) {//可变参数其实就是一个数组
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }

    /*private static void print2(int x, int... arr) {
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }*/

    /*private static void print2(int... arr, int x) {//报错，实参会全部赋给可变参数arr，x没有值
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }*/
}
