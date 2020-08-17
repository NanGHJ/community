/**
 * Project Name:community
 * File Name:MyThread
 * Package Name:life.majiang.community.test
 * Date:2020/7/21 9:42
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/21 程碧泉 新建
 */
public class Product implements Runnable{

    private BreadCon con;

    public Product(BreadCon con) {
        super();
        this.con = con;
    }

    @Override
    public void run() {
        for (int i=0;i<30;i++){
            con.input(new Bread(i,Thread.currentThread().getName()));
        }
    }
}
