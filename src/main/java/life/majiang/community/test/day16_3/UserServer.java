/**
 * Project Name:community
 * File Name:UserServer
 * Package Name:life.majiang.community.test.day16_3
 * Date:2020/8/4 14:14
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day16_3;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class UserServer {
    public static void main(String[] args){
        new RegistThread().start();
        new LoginThread().start();
    }
}
