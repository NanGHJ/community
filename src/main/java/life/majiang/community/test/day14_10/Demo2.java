/**
 * Project Name:community
 * File Name:Demo2
 * Package Name:life.majiang.community.test.day14_10
 * Date:2020/7/22 14:02
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_10;

import java.util.LinkedList;
import java.util.Queue;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class Demo2 {
    public static void main(String[] args){
        //1.创建队列
        Queue<String> queue = new LinkedList<>();
        //2.入队
        queue.offer("pingguo");
        queue.offer("juzi");
        queue.offer("xigua");
        queue.offer("mangguo");
        queue.offer("yangmei");
        //获取第一个元素，但不会将其从队列中删除
        System.out.println(queue.peek());
        System.out.println("元素个数："+queue.size());
        int size = queue.size();
        //3.出队
        for(int i=0;i<size;i++){
            //获取第一个元素，并将其从队列中移除
            System.out.println(queue.poll());
        }
        System.out.println("元素个数："+queue.size());

    }
}
