/**
 * Project Name:community
 * File Name:DateUtils
 * Package Name:life.majiang.community.test.Person1
 * Date:2020/8/12 16:47
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.Person1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class DateUtils {
    private static  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    //1.字符串转换为util.Date
    public static java.util.Date strToUtil(String string){
        try{
            java.util.Date date = sdf.parse(string);
            return date;
        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }
    //2.util.Date转换为sql.Date
    public static java.sql.Date utilToSql(java.util.Date date){
        return new java.sql.Date(date.getTime());
    }
    //3.util.Date转换为字符串形式
    public static String utilToString(java.util.Date date){
        return sdf.format(date);
    }
}
