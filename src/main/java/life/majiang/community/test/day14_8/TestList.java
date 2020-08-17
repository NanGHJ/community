/**
 * Project Name:community
 * File Name:TestList
 * Package Name:life.majiang.community.test.day14_8
 * Date:2020/7/22 10:48
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_8;

import java.util.Arrays;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class TestList {
    public static void main(String args[]) throws Exception{
        MyList list = new MyList();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                list.add("hello");
            }
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                list.add("world");
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(Arrays.toString(list.getStr()));
    }
}
