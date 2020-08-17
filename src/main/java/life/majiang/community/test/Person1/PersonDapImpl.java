/**
 * Project Name:community
 * File Name:PersonDapImpl
 * Package Name:life.majiang.community.test.Person1
 * Date:2020/8/12 15:22
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.Person1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class PersonDapImpl {
    //增
    public int insert(Person person){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "insert into person (name,age,borndate,email,address) values (?,?,?,?,?);";
        try {
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,person.getName());
            preparedStatement.setInt(2,person.getAge());
            preparedStatement.setDate(3,DateUtils.utilToSql(person.getBornDate()));
            preparedStatement.setString(4,person.getEmail());
            preparedStatement.setString(5,person.getAddress());
            int result = preparedStatement.executeUpdate();
            return result;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(connection,preparedStatement,null);
        }
        return 0;
    }
    //删
    public int delete(int id){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "delete from person where id = ?;";
        try{
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int result = preparedStatement.executeUpdate();
            return result;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(connection,preparedStatement,null);
        }
        return 0;
    }
    //改
    public int update(Person person){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "update person set name=?,age=?,borndate=?,email=?,address=? where id=?;";
        try{
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,person.getName());
            preparedStatement.setInt(2,person.getAge());
            preparedStatement.setDate(3,DateUtils.utilToSql(person.getBornDate()));
            preparedStatement.setString(4,person.getEmail());
            preparedStatement.setString(5,person.getAddress());
            preparedStatement.setInt(6,person.getId());
            int result = preparedStatement.executeUpdate();
            return result;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(connection,preparedStatement,null);
        }
        return 0;
    }
    //查一个
    public Person select(int id){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Person person = null;
        String sql = "select * from person where id = ?;";
        try{
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                person = new Person();
                int pid = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                Date borndate = resultSet.getDate("borndate");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                person.setId(pid);
                person.setName(name);
                person.setAge(age);
                person.setBornDate(borndate);
                person.setEmail(email);
                person.setAddress(address);
            }
            return person;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(connection,preparedStatement,resultSet);
        }
        return null;
    }
    public Person select(String name){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Person person = null;
        String sql = "select * from person where name = ?;";
        try{
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                person = new Person();
                int pid = resultSet.getInt("id");
                String pname = resultSet.getString("name");
                int age = resultSet.getInt("age");
                Date borndate = resultSet.getDate("borndate");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                person.setId(pid);
                person.setName(pname);
                person.setAge(age);
                person.setBornDate(borndate);
                person.setEmail(email);
                person.setAddress(address);
            }
            return person;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(connection,preparedStatement,resultSet);
        }
        return null;
    }
    //查全部
    public List<Person> selectAll(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Person person = null;
        List<Person> personList = new ArrayList<>();
        try {
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement("select * from person;");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int pid = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                Date borndate = resultSet.getDate("borndate");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");

                person = new Person(pid,name,age,borndate,email,address);
                personList.add(person);
            }
            return personList;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}
