/**
 * Project Name:community
 * File Name:TestTicket
 * Package Name:life.majiang.community.test.day14_8
 * Date:2020/7/22 10:57
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day14_8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/22 程碧泉 新建
 */
public class TestTicket {
    public static void main(String[] args){
        Ticket ticket = new Ticket();
        ExecutorService es = Executors.newFixedThreadPool(4);
        for(int i=0;i<4;i++){
            es.submit(ticket);
        }
        es.shutdown();
    }

}
