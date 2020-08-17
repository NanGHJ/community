/**
 * Project Name:community
 * File Name:Student
 * Package Name:life.majiang.community.test.day15_1
 * Date:2020/7/23 10:21
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day15_1;

import java.io.Serializable;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/23 程碧泉 新建
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 100L;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

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
}
