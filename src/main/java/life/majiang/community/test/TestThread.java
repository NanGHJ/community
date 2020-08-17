/**
 * Project Name:community
 * File Name:TestThread
 * Package Name:life.majiang.community.test
 * Date:2020/7/21 9:44
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/21 程碧泉 新建
 */
public class TestThread {
    public static void main(String[] args){
        BreadCon con = new BreadCon();
        Product product = new Product(con);
        Consume consume = new Consume(con);
        Thread abc = new Thread(product,"1111");
        Thread bcd = new Thread(consume,"2222");
        Thread cde = new Thread(product,"3333");
        Thread efg = new Thread(consume,"4444");
        abc.start();
        bcd.start();
        cde.start();
        efg.start();
    }


}
