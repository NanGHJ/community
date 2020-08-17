/**
 * Project Name:community
 * File Name:Demo4
 * Package Name:life.majiang.community.test.day18_2
 * Date:2020/8/10 14:48
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/10 程碧泉 新建
 */
public class Demo4 {
    public static void main(String[] args){
        //1.创建DatetimeFormatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //2.把时间格式化成字符串
        String format = dtf.format(LocalDateTime.now());
        System.out.println(format);

        //3.把字符串解析成时间
        LocalDateTime parse = LocalDateTime.parse("2020-04-25 15:24:36",dtf);
        System.out.println(parse);

    }
}
