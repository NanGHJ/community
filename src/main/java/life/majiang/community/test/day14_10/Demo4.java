/**
 * Project Name:community
 * File Name:Demo4
 * Package Name:life.majiang.community.test.day14_10
 * Date:2020/7/22 14:31
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
public class Demo4 {
    public static void main(String[] args) throws Exception{
        //创建一个有界队列
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
        //添加元素
        queue.put("aaa");
        queue.put("bbb");
        queue.put("ccc");
        queue.put("ddd");
        queue.put("eee");
        System.out.println("已经添加完5个元素");
        queue.take();//删除第一个元素
        queue.put("xyz");
        System.out.println("添加第六个元素");
        System.out.println(queue.toString());
    }
}
