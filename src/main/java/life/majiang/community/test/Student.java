/**
 * Project Name:community
 * File Name:Student
 * Package Name:life.majiang.community.test
 * Date:2020/7/15 17:10
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/15 程碧泉 新建
 */
public class Student {
    private String name;
    private int stuNo;

    public void setName(String name) {
        this.name = name;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public int getStuNo() {
        return stuNo;
    }
    public Student(){

    }

    public Student(String name, int stuNo) {
        this.name = name;
        this.stuNo = stuNo;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", stuNo=" + stuNo + '}';
    }
}
