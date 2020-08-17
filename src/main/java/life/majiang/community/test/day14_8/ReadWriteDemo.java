/**
 * Project Name:community
 * File Name:ReadWriteDemo
 * Package Name:life.majiang.community.test.day14_8
 * Date:2020/7/22 11:17
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_8;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class ReadWriteDemo {
    private ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock();
    private ReentrantReadWriteLock.ReadLock readLock = rrwl.readLock();
    private ReentrantReadWriteLock.WriteLock writeLock = rrwl.writeLock();
    private String value;
    public String getValue(){
        readLock.lock();
        try {
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.getMessage();
            }
            System.out.println("读取:"+this.value);
            return this.value;
        }finally {
            readLock.unlock();
        }
    }
    public void setValue(String value){
        writeLock.lock();
        try {
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.getMessage();
            }
            System.out.println("写入:"+value);
            this.value = value;
        }finally {
            writeLock.unlock();
        }
    }
}
