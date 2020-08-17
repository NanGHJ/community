/**
 * Project Name:community
 * File Name:Demo2
 * Package Name:life.majiang.community.test.day18_2
 * Date:2020/8/10 14:17
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_2;

import java.time.LocalDateTime;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/10 程碧泉 新建
 */
public class Demo2 {
    public static void main(String[] args){
        //1.创建本地时间
        LocalDateTime localDateTime = LocalDateTime.now();
        //localDateTime localDateTime1 = LocalDateTime.of(year,month,dayOfMonth,hour,minute);
        System.out.println(localDateTime);
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());

        //添加2天
        LocalDateTime localDateTime1 = localDateTime.plusDays(2);
        System.out.println(localDateTime1);

        //减少一个月
        LocalDateTime localDateTime2 = localDateTime.minusMonths(1);
        System.out.println(localDateTime2);
    }
}
