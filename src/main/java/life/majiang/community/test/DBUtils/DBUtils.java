/**
 * Project Name:community
 * File Name:DBUtils
 * Package Name:life.majiang.community.test.DBUtils
 * Date:2020/8/12 11:20
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 重用性方案
 * 获取连接
 * 释放资源
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class DBUtils {

    //类加载只执行一次
    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    //1.获取连接
    public static Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc://localhost:3306/test", "root", "123456");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

    //2.释放资源
    public static void closeAll(Connection connection, Statement statement, ResultSet resultSet){
        try{
            if(resultSet != null){
                resultSet.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
