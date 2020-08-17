/**
 * Project Name:community
 * File Name:Demo4
 * Package Name:life.majiang.community.test.day14_8
 * Date:2020/7/22 10:17
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class Demo4 {
    public static void main(String[] args) throws Exception{
        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<Integer> future1 = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 1; i <= 50; i++) {
                    sum += i;
                }
                System.out.println("1-50计算完毕");
                return sum;
            }
        });
        Future<Integer> future2 = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 51; i <= 100; i++) {
                    sum += i;
                }
                System.out.println("51-100计算完毕");
                return sum;
            }
        });
        int sum = future1.get()+future2.get();
        System.out.println("计算完毕"+sum);

        es.shutdown();
    }
}
