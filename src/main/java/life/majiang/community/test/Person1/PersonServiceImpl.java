/**
 * Project Name:community
 * File Name:PersonServiceImpl
 * Package Name:life.majiang.community.test.Person1
 * Date:2020/8/13 9:23
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.Person1;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/13 程碧泉 新建
 */
public class PersonServiceImpl {
    //注册 一个业务功能由一个或多个DAO的访问操作组成
    public void register(Person person){
        PersonDapImpl personDap = new PersonDapImpl();
        //1.查询用户是否存在
        Person person1 = personDap.select(person.getName());
        //2.若不存在，则新建
        if(person1 == null){
            personDap.insert(person);
            System.out.println("注册成功");
        }else {
            //若存在，则返回
            System.out.println("用户已存在");
        }
    }
}
