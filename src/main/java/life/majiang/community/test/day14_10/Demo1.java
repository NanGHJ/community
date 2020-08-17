/**
 * Project Name:community
 * File Name:Demo1
 * Package Name:life.majiang.community.test.day14_10
 * Date:2020/7/22 11:58
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_10;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
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
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        ExecutorService es = Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++){
            es.submit(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<10;j++){
                        list.add(Thread.currentThread().getName()+new Random().nextInt(1000));
                    }
                }
            });
        }
        es.shutdown();
        while (!es.isTerminated()){}
        System.out.println("元素个数："+list.size());
        for (String string : list
             ) {
            System.out.println(string);
        }
    }
}

