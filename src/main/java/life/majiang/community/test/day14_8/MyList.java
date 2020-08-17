/**
 * Project Name:community
 * File Name:MyList
 * Package Name:life.majiang.community.test.day14_8
 * Date:2020/7/22 10:42
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class MyList {
    private Lock lock = new ReentrantLock();
    private String str[] = {"A","b","","",""};
    private int index = 2;

    public void add(String value){
        lock.lock();
        try {
            str[index] = value;
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.getMessage();
            }
            index++;
            System.out.println(Thread.currentThread().getName()+"添加了"+value);
        }finally {
            lock.unlock();
        }
    }
    public String[]  getStr(){
        return str;
    }
}
