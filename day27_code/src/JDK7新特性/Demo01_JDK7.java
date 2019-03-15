package JDK7新特性;

import java.util.ArrayList;
import java.util.List;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 20:54
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 */

public class Demo01_JDK7 {
    public static void main(String[] args) {
        System.out.println(0b110);//1.新增二进制字面值常量
        System.out.println(100_000);//2.数字字面值常量可以出现下划线,等同于逗号,便于阅读
        switch ("abc") {
            case "abc":
                break;
        }//3.switch语句可以用字符串
        List<String> list = new ArrayList<>();//4.泛型简化,菱形泛型

        //5.异常的多个catch合并,以逻辑或分隔

        //6.try-with-resources

    }
}
