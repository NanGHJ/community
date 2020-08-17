/**
 * Project Name:community
 * File Name:Person
 * Package Name:life.majiang.community.test.day17_1
 * Date:2020/8/4 15:44
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day17_1;

import java.io.Serializable;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class Person implements Serializable,Cloneable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Person(){
        System.out.println("无参构造执行了...");
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(name+"吃东西......");
    }

    public void eat(String food){
        System.out.println(name+"开始吃..."+food);
    }

    private void privateMethod(){
        System.out.println("这是一个私有方法");
    }

    public static void staticMethod(){
        System.out.println("这是一个静态方法");
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
