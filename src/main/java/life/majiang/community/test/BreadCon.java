/**
 * Project Name:community
 * File Name:BreadCon
 * Package Name:life.majiang.community.test
 * Date:2020/7/21 14:37
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/21 程碧泉 新建
 */
public class BreadCon {
    private Bread[] cons = new Bread[6];
    private int index=0;

    public synchronized void input(Bread b){
        while (index >= 6){
            try {
                this.wait();
            }catch (Exception e){
                e.getMessage();
            }
        }
        cons[index] = b;
        System.out.println(Thread.currentThread().getName()+"生成了"+b.getId());
        index++;
        this.notifyAll();
    }
    public synchronized void output(){
        while(index <= 0){
            try {
                this.wait();
            }catch (Exception e){
                e.getMessage();
            }
        }
        index--;
        Bread b = cons[index];
        System.out.println(Thread.currentThread().getName()+"消费了"+b.getId()+"生产者"+b.getProductName());
        cons[index] = null;
        this.notifyAll();
    }
}
