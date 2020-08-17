/**
 * Project Name:community
 * File Name:Demo6
 * Package Name:life.majiang.community.test.day14_10
 * Date:2020/7/22 15:01
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_10;

import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class Demo6 {
    public static void main(String[] args){
        //1.创建线程安全集合
        ConcurrentHashMap<String,String> hashMap = new ConcurrentHashMap<String, String>();
        //2.使用多线程添加数据
        for(int i=0;i<5;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<10;j++){
                        hashMap.put(Thread.currentThread().getName()+"---"+j,j+"");
                        System.out.println(hashMap);
                    }
                }
            }).start();
        }
    }
}
