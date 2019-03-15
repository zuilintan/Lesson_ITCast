package test;

/**
 * @作者: LinTan
 * @日期: 2019/3/4 13:49
 * @版本: 1.0
 * @描述: //final, finally, finalize的区别
 * 1.0: Initial Commit
 * <p>
 * final: 是一个修饰符。修饰类，不能被继承。修饰方法，不能被重写。修饰变量，只能赋值一次
 * finally: 是try语句中的一个语句体，不能单独使用，用来释放资源。
 * finalize: 是一个方法。当垃圾回收器确定不存在该对象的更多引用时，由对象的垃圾回收器调用该方法
 *
 * </p>
 */

public class Test01 {
    public static void main(String[] args) {
        int i = method1();
        System.out.println(i);
    }

    private static int method1() {
        int i = 10;
        try {
            i = 20;
            System.out.println(1 / 0);
            System.out.println(i);//Pass
        } catch (Exception e) {
            i = 30;
            System.out.println(i);
            return i;//虽然finally中修改可i的值，但此时返回值已经固定为30了，不再改变
        } finally {
            i = 40;
            System.out.println(i);
        }//不要在finally中写返回语句，因为finally的作用是释放资源
        return i;
    }
}
