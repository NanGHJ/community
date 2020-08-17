/**
 * Project Name:community
 * File Name:Demo3
 * Package Name:life.majiang.community.test.day18_2
 * Date:2020/8/10 14:28
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_2;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/10 程碧泉 新建
 */
public class Demo3 {
    public static void main(String[] args){
        //1.创建Instant 时间戳
        Instant instant = Instant.now();
        System.out.println(instant.toString());
        System.out.println(instant.toEpochMilli());
        System.out.println(System.currentTimeMillis());

        //增减时间
        Instant instant1 = instant.plusSeconds(10);
        Instant instant2 = instant.minusSeconds(8);
        System.out.println(Duration.between(instant,instant1).toMillis());
        System.out.println(Duration.between(instant,instant2).toMillis());

        //2.ZoneId
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String str : availableZoneIds
             ) {
            System.out.println(str.toString());
        }
        System.out.println(ZoneId.systemDefault().toString());

        //Date ---> Instant ---> LocalDateTime
        System.out.println("---------------------------------------------------");
        Date date = new Date();
        Instant instant3 = date.toInstant();
        System.out.println(instant.toString());
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant3, ZoneId.systemDefault());
        System.out.println(localDateTime.toString());

        //LocalDateTime ---> Instant --->Date
        System.out.println("----------------------------------------------------");
        Instant instant4 = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        System.out.println(instant4);
        Date from = Date.from(instant4);
        System.out.println(from);
    }
}
