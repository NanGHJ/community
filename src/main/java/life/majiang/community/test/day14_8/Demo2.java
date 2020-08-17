/**
 * Project Name:community
 * File Name:Demo2
 * Package Name:life.majiang.community.test.day14_8
 * Date:2020/7/22 9:57
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_8;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class Demo2 {
    public static void main(String args[]) throws Exception{
        //1创建Callable对象
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println(Thread.currentThread().getName() + "开始计算");
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }
                return sum;
            }
        };
        //2把Callbale对象转换成可执行任务
        FutureTask<Integer> task = new FutureTask<>(callable);

        //3创建线程
        Thread thread = new Thread(task);
        //4启动线程
        thread.start();
        //5获取结果
        Integer sum = task.get();
        System.out.println("结果是："+sum);
    }
}
