/**
 * Project Name:community
 * File Name:TestORM
 * Package Name:life.majiang.community.test.ORM
 * Date:2020/8/12 14:47
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.ORM;

import life.majiang.community.test.DBUtils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class TestORM {
    public static void main(String[] args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<T_jobs> t_jobsList = new ArrayList<>();
        try{
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement("select * from t_jobs");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String job_id = resultSet.getString("job_id");
                String job_title = resultSet.getString("job_title");
                String min_salary = resultSet.getString("min_salary");
                String max_salary = resultSet.getString("max_salary");
                //创建对象，封装查询到的零散数据
                T_jobs t_jobs = new T_jobs();
                t_jobs.setJob_id(job_id);
                t_jobs.setJob_title(job_title);
                t_jobs.setMin_salary(min_salary);
                t_jobs.setMax_salary(max_salary);
                //每遍历一次得到的对象，存放在集合里，方便后续使用
                t_jobsList.add(t_jobs);
            }
            //遍历集合
            for(T_jobs t : t_jobsList){
                System.out.println(t);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(connection,preparedStatement,resultSet);
        }
    }
}
