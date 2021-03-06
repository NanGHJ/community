/**
 * Project Name:community
 * File Name:DBUtils
 * Package Name:life.majiang.community.test.Person
 * Date:2020/8/12 15:06
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.Person1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class DBUtils {
    private static final Properties PROPERTIES = new Properties();

    //类加载只执行一次
    static {
        InputStream is = DBUtils.class.getResourceAsStream("/db.prpperties");
        try{
            PROPERTIES.load(is);
            Class.forName(PROPERTIES.getProperty("driver"));
        }catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    //1.获取连接
    public static Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(PROPERTIES.getProperty("url"),PROPERTIES.getProperty("username"),PROPERTIES.getProperty("password"));
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
