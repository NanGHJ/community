/**
 * Project Name:community
 * File Name:QueryJDBC
 * Package Name:life.majiang.community.test.day18_2
 * Date:2020/8/12 9:53
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class QueryJDBC {
    public static void main(String[] args) throws Exception{
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获得连接对象
        Connection connection = DriverManager.getConnection("jdbc://localhost:3306/test", "root", "123456");
        //3.获取执行sql语句的对象
        Statement statement = connection.createStatement();
        //4.执行sql语句，并接受结果
        ResultSet resultSet = statement.executeQuery("select * from t_jobs");
        //5.处理结果
        //判断下一行是否有数据
        while(resultSet.next()){
            //对当前数据每列数据进行获取
            //1.根据列的编号
//            String job_id = resultSet.getString(1);
//            String job_name = resultSet.getString(2);
//            String min_salary = resultSet.getString(3);
//            String max_salary = resultSet.getString(4);
            //2.根据列名
            String job_id = resultSet.getString("job_id");
            String job_name = resultSet.getString("job_name");
            String min_salary = resultSet.getString("min_salary");
            String max_salary = resultSet.getString("max_salary");
            System.out.println(job_id+"\t"+job_name+"\t"+min_salary+"\t"+max_salary);
        }
        //6.释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
