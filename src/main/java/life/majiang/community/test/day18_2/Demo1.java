/**
 * Project Name:community
 * File Name:Demo1
 * Package Name:life.majiang.community.test.day18_2
 * Date:2020/8/10 11:22
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * TODO
 *
 * @author 程碧泉
 * @history 2020/8/10 程碧泉 新建
 * @since JDK1.7
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        //存在线程安全问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Callable<Date> callable = new Callable<Date>() {
            @Override
            public Date call() throws Exception {
                synchronized (sdf) {
                    return sdf.parse("2020-08-10");
                }
            }
        };
        List<Future<Date>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<Date> future = pool.submit(callable);
            list.add(future);
        }
        for (Future<Date> future : list) {
            System.out.println(future.get());
        }
        pool.shutdown();

        //不存在线程安全问题
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        ExecutorService pool2 = Executors.newFixedThreadPool(10);
        Callable<LocalDate> callable1 = new Callable<LocalDate>() {
            @Override
            public LocalDate call() throws Exception {
                return LocalDate.parse("20200810",dtf);
            }
        };
        List<Future<LocalDate>> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<LocalDate> future = pool2.submit(callable1);
            list1.add(future);
        }
        for (Future<LocalDate> future : list1) {
            System.out.println(future.get());
        }
        pool2.shutdown();
    }
}
