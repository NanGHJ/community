/**
 * Project Name:community
 * File Name:SingleTon2
 * Package Name:life.majiang.community.test.day17_3
 * Date:2020/8/5 11:21
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day17_3;

/**
 * 懒汉式单例
 * 1. 首先创建一个对象，并赋值为null
 * 2. 构造方法改成私有的，使得类外部不能创建对象
 * 3. 通过一个公开的方法，返回这个对象
 *
 * 优点：生命周期短，节省空间
 * 缺点：有线程安全问题
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/5 程碧泉 新建
 */
public class SingleTon2 {
    private static SingleTon2 instance = null;
    private SingleTon2(){}
    //线程不安全的解决方式
    //1.同步方法
//    public static synchronized SingleTon2 getInstance(){
//        if(instance == null){
//            instance = new SingleTon2();
//        }
//        return instance;
//    }
    //2.同步代码块
    public static SingleTon2 getInstance(){
        if(instance == null){//这个判断是为了提高执行效率：当有一个线程执行过instance时，就无需再判断synchronized，直接返回即可
            synchronized (SingleTon2.class){
                if(instance == null){
                    instance = new SingleTon2();
                }
            }
        }
        return instance;
    }
}
