/**
 * Project Name:community
 * File Name:TestPersonSelectAll
 * Package Name:life.majiang.community.test.Person1
 * Date:2020/8/12 16:20
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.Person1;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class TestPersonSelectAll {
    public static void main(String[] args){
        PersonDapImpl personDap = new PersonDapImpl();
        List<Person> personList = new ArrayList<>();
        for(Person p : personList){
            System.out.println(p);
        }
    }
}
