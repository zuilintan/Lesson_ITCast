package learn.wrapclass;

/**
 * @作者: LinTan
 * @日期: 2019/2/17 23:17
 * @版本: 1.0
 * @描述: //Integer面试题
 * 1.0: Initial Commit
 */

public class Demo5_Integer {
    public static void main(String[] args) {
        question1();
    }

    private static void question1() {
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i1.equals(i2));//true
        System.out.println(i3.equals(i4));//true
        System.out.println(i1 == i2);//false
        System.out.println(i3 == i4);//false

        Integer i5 = 127;
        Integer i6 = 127;
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i5.equals(i6));//true
        System.out.println(i7.equals(i8));//true
        System.out.println(i5 == i6);//true
        System.out.println(i7 == i8);//false，-128到127是byte的取值范围，在此范围内，自动装箱不会创建新对象，而是从常量池中获取。若超过byte取值范围就会再创建对象
    }
}
