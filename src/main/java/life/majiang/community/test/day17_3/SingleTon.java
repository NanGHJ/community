/**
 * Project Name:community
 * File Name:SingleTon
 * Package Name:life.majiang.community.test.day17_3
 * Date:2020/8/5 11:13
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day17_3;

/**
 * 饿汉式单例
 * 1. 首先创建一个常量
 * 2. 构造方法改成私有的，使得类外部不能创建对象
 * 3. 通过一个公开的方法，返回这个对象
 *
 * 优点：线程安全
 * 缺点：生命周期太长，浪费空间
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/5 程碧泉 新建
 */
public class SingleTon {
    private static final SingleTon instance = new SingleTon();
    private SingleTon(){}
    public static SingleTon getInstance(){
        return instance;
    }
}
