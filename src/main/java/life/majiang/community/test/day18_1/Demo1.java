/**
 * Project Name:community
 * File Name:Demo1
 * Package Name:life.majiang.community.test.day18_1
 * Date:2020/8/6 9:28
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_1;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/6 程碧泉 新建
 */
public class Demo1 {
    public static void main(String[] args){
        //匿名内部类
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程已启动...");
            }
        };
        //Lambda表达式
        Runnable runnable2 = () ->System.out.println("子线程2已启动...");
        new Thread(runnable2).start();
        new Thread(() ->System.out.println("子线程3已启动...")).start();

        //匿名内部类
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        //Lambda表达式
        /*
        注意事项
        1.形参列表的数据类型会自动判断(即哦o1,o2的数据类型由com2的数据类型来决定)
        2.如果形参列表为空，只需要保留()
        3.如果形参列表只有一个参数，()可以省略，只需要参数的名称即可
        4.如果执行语句只有一句，且无返回值，{}可以省略，若有返回值，想省去{},则必须同时省略return，且执行语句也保证只有一句话
        5.Lambda表达式不会生成一个单独的内部类文件
         */
        Comparator<String> com2 = (o1, o2)->{
            return o1.length()-o2.length();
        };
        Comparator<String> com3 = (o1,o2)-> o1.length()-o2.length();

        TreeSet<String> treeSet = new TreeSet<>(com3);
    }
}
