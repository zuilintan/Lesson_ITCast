package exception;

/**
 * @作者: LinTan
 * @日期: 2019/3/4 11:35
 * @版本: 1.0
 * @描述: //finally
 * 1.0: Initial Commit
 * <p>
 * 被finally修饰的语句一定会执行，哪怕catch中有return
 * 特殊情况: 在执行到finally之前JVM退出了(eg: System.exit(0))
 * 作用: 用于释放资源，在IO流和数据库中常见
 * </p>
 */

public class Demo07_Finally {

    public static void main(String[] args) {
        method01();
        method02();
        method03();
        method04();
    }

    private static void method01() {
        try {
            System.out.println(10 / 2);
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println();
    }

    private static void method02() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println();
    }

    private static void method03() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("catch");
            return;//执行finally后回来执行return
        } finally {
            System.out.println("finally");
        }
        System.out.println();//不被执行
    }

    private static void method04() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("catch");
            System.exit(0);//退出JVM
        } finally {
            System.out.println("finally");//不被执行
        }
        System.out.println();
    }
}
