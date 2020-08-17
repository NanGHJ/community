/**
 * Project Name:community
 * File Name:AccountDaoImpl
 * Package Name:life.majiang.community.test.account
 * Date:2020/8/13 9:53
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/13 程碧泉 新建
 */
public class AccountDaoImpl {
    public int insert(Account account){
        return 0;
    }
    public int delete(int cardNo){
        return 0;
    }
    //修改
    public int update(Account account){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "update account set password = ?,name = ?,balance = ? where cardno = ?;";
        try{
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,account.getPassword());
            preparedStatement.setString(2,account.getName());
            preparedStatement.setDouble(3,account.getBalance());
            preparedStatement.setString(4,account.getCardNo());
            int result = preparedStatement.executeUpdate();
            return result;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(null,preparedStatement,null);
        }
        return 0;
    }
    //查询
    public Account select(String cardNo){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Account account = null;
        String sql = "select * from account where cardno = ?;";
        try {
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,cardNo);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                String cardNos = resultSet.getString("cardNo");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");
                double balance = resultSet.getDouble("balance");
                account = new Account(cardNos,password,name,balance);
            }
            return account;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeAll(null,preparedStatement,resultSet);
        }
        return null;
    }
}
