/**
 * Project Name:community
 * File Name:Demo8
 * Package Name:life.majiang.community.test.day18_1
 * Date:2020/8/10 10:58
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/10 程碧泉 新建
 */
public class Demo8 {
    public static void main(String[] args){
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("张三",1200));
        list.add(new Employee("李四",2040));
        list.add(new Employee("王五",3200));
        list.add(new Employee("赵六",4050));
        list.add(new Employee("钱七",5100));
        //终止操作
        //1 foreach遍历
        System.out.println("------foreach遍历------");
        list.stream()
                .filter(e -> e.getMoney()>3000)
                .forEach(System.out::println);
        //2 min最小值
        System.out.println("------min最小值------");
        Optional<Employee> min = list.stream().min((e1, e2) -> Double.compare(e1.getMoney(), e2.getMoney()));
        System.out.println(min.get());
        //3 max最大值
        System.out.println("------max最大值------");
        Optional<Employee> max = list.stream().max((e1, e2) -> Double.compare(e1.getMoney(), e2.getMoney()));
        System.out.println(max.get());
        //4 count计数
        System.out.println("------count计数------");
        long count = list.stream().count();
        System.out.println("员工个数:"+count);
        //5 reduce规约
        System.out.println("------reduce规约------");
        //计算所有员工的工资之合
        Optional<Double> sum = list.stream().map(e -> e.getMoney()).reduce((x, y) -> x + y);
        System.out.println(sum.get());
        //6 collect收集
        System.out.println("------collect收集------");
        //获取所有员工姓名，封装成一个list集合
        List<String> names = list.stream().map(e -> e.getName()).collect(Collectors.toList());
        for (String str : names
             ) {
            System.out.println(str);
        }

    }
}
