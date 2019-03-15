package thread02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 16:43
 * @版本: 1.0
 * @描述: //线程池
 * 1.0: Initial Commit
 */

public class Demo05_Executors {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);//创建线程池
        pool.submit(new MyRunnable());//添加线程到线程池中
        pool.submit(new MyRunnable());
        pool.shutdown();//关闭线程池
    }
}
