/**
 * Project Name:community
 * File Name:TestPersonSelect
 * Package Name:life.majiang.community.test.Person1
 * Date:2020/8/12 16:02
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.Person1;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class TestPersonSelect {
    public static void main(String[] args){
        PersonDapImpl personDap = new PersonDapImpl();
        Person person = personDap.select(2);
        if(person != null){
            System.out.println(person);
        }else {
            System.out.println("该用户不存在");
        }
    }
}
