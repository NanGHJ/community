/**
 * Project Name:community
 * File Name:Demo
 * Package Name:life.majiang.community.test.day14_10
 * Date:2020/7/22 11:42
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_10;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class Demo {
    public static void main(String[] args){
//        //1创建arrayL
//        ArrayList<String> arrayList = new ArrayList<>();
//        //1.1使用Collections中的线程安全方法转成线程安全的集合
//        List<String> synchronizedList = Collections.synchronizedList(arrayList);
        //1.2使用CopyOnWriteArrayList
        CopyOnWriteArrayList arrayList = new CopyOnWriteArrayList();
        //2创建线程
        for(int i=0;i<20;i++){
            int temp = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<10;j++){
                        arrayList.add(Thread.currentThread().getName()+"==="+temp+"==="+j);
                        System.out.println(arrayList.toString());
                    }
                }
            }).start();
        }
    }
}
