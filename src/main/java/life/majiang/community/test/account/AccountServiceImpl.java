/**
 * Project Name:community
 * File Name:AccountServiceImpl
 * Package Name:life.majiang.community.test.account
 * Date:2020/8/13 10:11
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.account;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/13 程碧泉 新建
 */
public class AccountServiceImpl {
    //转账  收参
    public void transfer(String fromNo,String pwd,String toNo,double money){
        AccountDaoImpl accountDao = new AccountDaoImpl();
        //2.组织完善业务功能

        try {
            //调用DBUtils开启事务
            DBUtils.begin();
            //2.1验证fromNo是否存在
            Account account = accountDao.select(fromNo);
            if(account == null){
                throw new RuntimeException("用户不存在！");
            }
            //2.2验证fronNo的密码pwd是否正确
            if(!account.getPassword().equals(pwd)){
                throw new RuntimeException("用户密码错误！");
            }

            //2.3验证fromNo的余额money是否足够
            if(account.getBalance() < money){
                throw new RuntimeException("用户余额不足！");
            }

            //2.4验证toNo是否存在
            Account toAccount = accountDao.select(toNo);
            if(toAccount == null){
                throw new RuntimeException("对方用户不存在！");
            }

            //2.5减少fromNo的余额
            account.setBalance(account.getBalance() - money);
            accountDao.update(account);

            //2.6增加toNo的余额
            toAccount.setBalance(toAccount.getBalance() + money);
            accountDao.update(toAccount);
            System.out.println("转账成功");
            //转账成功！则整个事务提交
            DBUtils.commit();
        } catch (RuntimeException e) {
            System.out.println("转账失败");
            //如果当前事务异常，则回滚当前整个事务

            DBUtils.rollback();

            e.printStackTrace();
        }


    }
}
