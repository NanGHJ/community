/**
 * Project Name:community
 * File Name:ReadWriteTest
 * Package Name:life.majiang.community.test.day14_8
 * Date:2020/7/22 11:29
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_8;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class ReadWriteTest {
    public static void main(String[] args){
        ReadWriteDemo readWriteDemo = new ReadWriteDemo();
        ExecutorService es = Executors.newFixedThreadPool(20);
        Runnable read = new Runnable() {
            @Override
            public void run() {
                readWriteDemo.getValue();
            }
        };
        Runnable write = new Runnable() {
            @Override
            public void run() {
                readWriteDemo.setValue("张三"+new Random().nextInt(100));
            }
        };
        for(int i=0;i<2;i++){
            es.submit(write);
        }
        for(int i=0;i<18;i++){
            es.submit(read);
        }
        es.shutdown();
    }
}
