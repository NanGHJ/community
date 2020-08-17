/**
 * Project Name:community
 * File Name:Demo3
 * Package Name:life.majiang.community.test.day14_8
 * Date:2020/7/22 10:09
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
public class Demo3 {
    public static void main(String args[]) throws Exception{
        //1创建线程池
        ExecutorService es = Executors.newFixedThreadPool(1);
        //2提交任务     Future表示将要执行完成任务的结果
        Future<Integer> future = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }
                return sum;
            }
        });
        //获取结果
        System.out.println(future.get());
        //关闭线程池
        es.shutdown();
    }
}
