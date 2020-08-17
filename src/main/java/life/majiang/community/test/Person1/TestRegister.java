/**
 * Project Name:community
 * File Name:TestRegister
 * Package Name:life.majiang.community.test.Person1
 * Date:2020/8/13 9:44
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.Person1;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/13 程碧泉 新建
 */
public class TestRegister {
    public static void main(String[] args){
        PersonServiceImpl personService = new PersonServiceImpl();
        Person person = new Person("Marry",18,DateUtils.strToUtil("1999-09-09"),"Marry@123.com","北京市");
        personService.register(person);

    }
}
