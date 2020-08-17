/**
 * Project Name:community
 * File Name:SingleTon3
 * Package Name:life.majiang.community.test.day17_3
 * Date:2020/8/5 11:35
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day17_3;

/**
 * 单例模式的第三种写法：静态内部类写法
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/5 程碧泉 新建
 */
public class SingleTon3 {
    private SingleTon3(){}

    private static class Holder{
        static SingleTon3 instance = new SingleTon3();
    }
    public static SingleTon3 getInstance(){
        return Holder.instance;
    }
}
