/**
 * Project Name:community
 * File Name:TestTimes
 * Package Name:life.majiang.community.test.Person1
 * Date:2020/8/12 16:26
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.Person1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class TestTimes {
    public static void main(String[] args) throws Exception{
        //获得当前系统的日期时间
        System.out.println(new java.util.Date());
        //字符串：自定义日期
        String str = "1999-06-06";

        //将字符串转化成Util.Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //parse方法
        Date date = sdf.parse(str);
        System.out.println(date);
        //format方法转换为String类型
        String dates = sdf.format(new Date());
        System.out.println(dates);
        //sql.Date 不支持字符串转换，只支持毫秒值创建
        //通过util.Date拿到指定日期的毫秒值，转换为sql.Date
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println(sqlDate);
    }
}
