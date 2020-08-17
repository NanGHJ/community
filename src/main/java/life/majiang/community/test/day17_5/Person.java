/**
 * Project Name:community
 * File Name:Person
 * Package Name:life.majiang.community.test.day17_5
 * Date:2020/8/5 14:36
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day17_5;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/5 程碧泉 新建
 */
public class Person {
    @MyAnnotation()
    public void show(){

    }
    @PersonInfo(name = "小月月",age = 18,sex = "女")
    public void show(String name,int age,String sex){
        System.out.println(name+"是一名"+age+"岁的美"+sex);
    }
}
