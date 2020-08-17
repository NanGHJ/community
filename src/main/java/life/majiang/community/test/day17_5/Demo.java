/**
 * Project Name:community
 * File Name:Demo
 * Package Name:life.majiang.community.test.day17_5
 * Date:2020/8/5 14:49
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day17_5;

import java.lang.reflect.Method;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/5 程碧泉 新建
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        //1.获取类对象
        Class<?> class1 = Class.forName("life.majiang.community.test.day17_5.Person");
        //2.获取类方法
        Method method = class1.getMethod("show", String.class, int.class, String.class);
        //3.获取类方法上面的注解信息
        PersonInfo personInfo = method.getAnnotation(PersonInfo.class);
        //4.打印注解信息
        System.out.println(personInfo.name());
        System.out.println(personInfo.age());
        System.out.println(personInfo.sex());
        //5.调用方法
        Person yueyue = (Person) class1.newInstance();
        method.invoke(yueyue,personInfo.name(),personInfo.age(),personInfo.sex());
    }
}
