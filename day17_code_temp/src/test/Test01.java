package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * @作者: LinTan
 * @日期: 2019/2/24 12:02
 * @版本: 1.0
 * @描述: 测试JDK8HashSet是否有序
 * 1.0: Initial Commit
 */

public class Test01 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            set.add(rand.nextInt(30) + (1 << 16));
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print((iterator.next() - (1 << 16)) + " ");
        }
        System.out.println();
    }
}
