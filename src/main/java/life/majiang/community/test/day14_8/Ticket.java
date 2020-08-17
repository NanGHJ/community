/**
 * Project Name:community
 * File Name:Ticket
 * Package Name:life.majiang.community.test.day14_8
 * Date:2020/7/22 10:53
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
public class Ticket implements Runnable{
    private int ticket = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            lock.lock();
            try{
                if(ticket <= 0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
                ticket--;
            }finally {
                lock.unlock();
            }

        }
    }
}
