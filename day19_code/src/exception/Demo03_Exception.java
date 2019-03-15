package exception;

/**
 * @作者: LinTan
 * @日期: 2019/3/3 11:59
 * @版本: 1.0
 * @描述: 多异常捕获
 * 1.0: Initial Commit
 */

public class Demo03_Exception {

    public static void main(String[] args) {
        method01();
        method02();//JDK7的新异常处理机制
    }

    private static void method01() {
        int a = 10;
        int b = 0;
        int[] arr = {11, 22, 33, 44, 55};

        try {
            System.out.println(a / b);
            System.out.println(arr[10]);
            arr = null;
            System.out.println(arr[0]);
        }/* catch (ArithmeticException e) {
            System.out.println("除数不能为零");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("数组越界异常");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }*/ catch (Exception e) {//父类引用指向子类对象，Exception e = new ArithmeticException();。推荐。
            System.out.println("出错了");
        }//try后跟多个catch，小的异常放前面，大的异常放后面。根据多态的原理，如果大的放前面，就会将所有的子类对象接收，后面的catch就没有意义了
        System.out.println("继续执行ing");
        System.out.println();
    }

    private static void method02() {
        int a = 10;
        int b = 0;
        int[] arr = {11, 22, 33, 44, 55};

        try {
            System.out.println(a / b);
            System.out.println(arr[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("出错了");
        }//将多个异常放入一个catch的参数列表中，用逻辑或分隔
    }
}
