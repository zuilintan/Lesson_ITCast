package learn.jdk5;

import java.util.Arrays;

import static java.util.Arrays.sort;
import static java.util.Arrays.toString;

/**
 * @作者: LinTan
 * @日期: 2019/2/22 19:24
 * @版本: 1.0
 * @描述: 静态导入
 * 1.0: Initial Commit
 * <p>
 * 格式: import static 包名....类型名.方法名;
 * 可以直接导入到方法级别
 * 注意: 方法必须是静态，若有多个同名的静态方法，容易不知道使用谁。这个时候就要使用前缀，由此可见，静态导入意义不大，但要了解
 * </p>
 */

public class Demo02_StaticImport {
    public static void main(String[] args) {
        int[] arr = {55, 22, 33, 44, 11};
        Arrays.sort(arr);
        sort(arr);//与下面的sort()冲突
        Arrays.toString(arr);
        //toString(arr);//与Object的toString()冲突
    }

/*    public static sort(int[] arr) {//eg this

    }*/
}
