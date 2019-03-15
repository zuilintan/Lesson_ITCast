package thread02;

import java.util.concurrent.*;

/**
 * @作者: LinTan
 * @日期: 2019/3/10 19:49
 * @版本: 1.0
 * @描述: //多线程第三种实现方式:Callable,了解即可
 * 1.0: Initial Commit
 * <p>
 * 相较于Runnable,Callable有返回值,可以抛异常
 * </p>
 */


public class Demo06_Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Integer> f1 = pool.submit(new MyCallable(100));
        Future<Integer> f2 = pool.submit(new MyCallable(300));
        System.out.println(f1.get());//抛异常
        System.out.println(f2.get());
        pool.shutdown();
    }
}

class MyCallable implements Callable<Integer> {
    private int num;

    public MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }//求1到num的和
        return sum;
    }
}