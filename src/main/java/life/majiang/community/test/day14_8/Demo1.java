/**
 * Project Name:community
 * File Name:Demo1
 * Package Name:life.majiang.community.test.day14_8
 * Date:2020/7/22 9:30
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class Demo1 {
    public static void main(String[] args){
        //1.1创建固定线程个数的线程池
        //ExecutorService es = Executors.newFixedThreadPool(4);
        //1.2创建缓存线程池，线程个数由任务个数来决定
        ExecutorService es = Executors.newCachedThreadPool();
        //创建任务
        Runnable runnable = new Runnable() {
            private int ticket = 100;
            @Override
            public void run() {
                while(true){
                    if(ticket <= 0){
                        break;
                    }
                    System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"票");
                    ticket--;
                }

            }
        };
        //提交任务
        for (int i=0;i<4;i++){
            es.submit(runnable);
        }
        //关闭线程池
        es.shutdown();//等待任务执行完毕，然后关闭线程池
    }
}
