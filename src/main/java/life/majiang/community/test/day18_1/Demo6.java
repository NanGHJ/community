/**
 * Project Name:community
 * File Name:Demo6
 * Package Name:life.majiang.community.test.day18_1
 * Date:2020/8/10 10:29
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_1;

import java.util.ArrayList;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/10 程碧泉 新建
 */
public class Demo6 {
    public static void main(String[] args){
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("张三",1000));
        list.add(new Employee("李四",2000));
        list.add(new Employee("王五",3000));
        list.add(new Employee("赵六",4000));
        list.add(new Employee("钱七",5000));
        list.add(new Employee("钱七",5000));
        //中间操作1
        //1 filter过滤
        System.out.println("------filter过滤------");
        list.stream()
                .filter(e->e.getMoney()>3000)
                .forEach(System.out::println);
        //2 limit限制
        System.out.println("------limit限制------");
        list.stream()
                .limit(3)
                .forEach(System.out::println);
        //3 skip跳过
        System.out.println("------skip跳过------");
        list.stream()
                .skip(3)
                .forEach(System.out::println);
        //4 distinct去重
        System.out.println("------distinct去重------");
        list.stream()
                .distinct()
                .forEach(System.out::println);
        //5 sorted排序
        System.out.println("------sorted排序------");
        list.stream()
                .sorted((e1,e2)->Double.compare(e1.getMoney(),e2.getMoney()))
                .forEach(System.out::println);

        //中间操作2
        //map
        System.out.println("------map------");
        list.stream()
                .map(e -> e.getName())
                .forEach(System.out::println);

        //中间操作3
        //parallelStream 采用多线程 效率更高
        System.out.println("------parallelStream------");
        list.parallelStream()
                .forEach(System.out::println);
    }
}
