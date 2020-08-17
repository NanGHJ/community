/**
 * Project Name:community
 * File Name:Demo3
 * Package Name:life.majiang.community.test.day14_10
 * Date:2020/7/22 14:16
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_10;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class Demo3 {
    public static void main(String[] args) throws Exception{
        //创建线程安全队列
        ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue();
        //创建线程并进行入队操作
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=5;i<10;i++){
                    clq.offer(i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    clq.offer(i);
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //出队操作
        int size = clq.size();
        for(int i=0;i<size;i++){
            System.out.println(clq.poll());
        }


    }
}
