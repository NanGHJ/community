/**
 * Project Name:community
 * File Name:TestAccount
 * Package Name:life.majiang.community.test.account
 * Date:2020/8/13 10:54
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.account;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/13 程碧泉 新建
 */
public class TestAccount {
    public static void main(String[] args){
        AccountServiceImpl accountService = new AccountServiceImpl();
        accountService.transfer("6002","1234","6003",1000);
    }
}
