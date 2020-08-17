/**
 * Project Name:community
 * File Name:DeleteJDBC
 * Package Name:life.majiang.community.test.day18_2
 * Date:2020/8/12 9:38
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class DeleteJDBC {
    public static void main(String[] args) throws Exception{
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获得连接对象
        Connection connection = DriverManager.getConnection("jdbc://localhost:3306/test", "root", "123456");
        //3.获得执行SQL对象
        Statement statement = connection.createStatement();
        //4.执行SQL语句，并接受结果
        int result = statement.executeUpdate("delete from t_jobs where job_id = 'H5_mgr';");
        //5.处理结果
        if(result == 1){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
        //6.释放资源
        statement.close();
        connection.close();
    }
}
