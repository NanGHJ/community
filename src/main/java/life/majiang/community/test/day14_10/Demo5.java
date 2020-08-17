/**
 * Project Name:community
 * File Name:Demo5
 * Package Name:life.majiang.community.test.day14_10
 * Date:2020/7/22 14:40
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_10;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class Demo5 {
    public static void main(String[] args){
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(6);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<30;i++){
                    try{
                        queue.put(i);
                        System.out.println(Thread.currentThread().getName()+"生产了第"+i+"号面包");
                    }catch (Exception e){
                        e.getMessage();
                    }
                }
            }
        },"明明");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<30;i++){
                    try{
                        queue.take();
                        System.out.println(Thread.currentThread().getName()+"消费了第"+i+"号面包");
                    }catch (Exception e){
                        e.getMessage();
                    }
                }
            }
        },"冰冰");

        t1.start();
        t2.start();
    }
}
