/**
 * Project Name:community
 * File Name:LoginJDBC
 * Package Name:life.majiang.community.test.day18_2
 * Date:2020/8/12 10:09
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_2;

import life.majiang.community.test.DBUtils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * PrepareStatement的作用
 * 1.预编译SQL语句，效率高
 * 2.安全，避免SQL注入
 * 3.可以动态填充数据，执行多个同构的SQL语句
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class LoginJDBC {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        String username = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DBUtils.getConnection();

//        Statement statement = connection.createStatement();
//
//        ResultSet resultSet = statement.executeQuery("select * from users where username = '" + username + "' and password = '" + password + "'");
//
//        if(resultSet.next()){
//            System.out.println("登录成功");
//        }else {
//            System.out.println("登录失败");
//        }
//
//        resultSet.close();
//        statement.close();
//        connection.close();
        //获得PreparedStatement对象，预编译SQL语句
        PreparedStatement preparedStatement = connection.prepareStatement("select * from users where username = ? and password = ?");

        //为？占位符复制
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);

        //执行SQL语句，并接受结果
        ResultSet resultSet = preparedStatement.executeQuery();

        //处理结果
        if(resultSet.next()){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

        DBUtils.closeAll(connection,preparedStatement,resultSet);
    }
}
