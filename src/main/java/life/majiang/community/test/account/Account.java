/**
 * Project Name:community
 * File Name:Account
 * Package Name:life.majiang.community.test.account
 * Date:2020/8/13 9:51
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.account;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/13 程碧泉 新建
 */
public class Account {
    private String cardNo;
    private String password;
    private String name;
    private double balance;

    public Account() {
    }

    public Account(String cardNo, String password, String name, double balance) {
        this.cardNo = cardNo;
        this.password = password;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "cardNo='" + cardNo + '\'' + ", password='" + password + '\'' + ", name='" + name + '\'' + ", balance=" + balance + '}';
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
