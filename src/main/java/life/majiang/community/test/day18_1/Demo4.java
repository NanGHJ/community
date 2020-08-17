/**
 * Project Name:community
 * File Name:Demo4
 * Package Name:life.majiang.community.test.day18_1
 * Date:2020/8/10 9:17
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_1;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用的使用
 * 1 对象::实例方法
 * 2 类::静态方法
 * 3 类::实例方法
 * 4 类::new
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/10 程碧泉 新建
 */
public class Demo4 {
    public static void main(String[] args){
        //1 对象::实例对象
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("hello");
        Consumer<String > consumer1 = System.out::println;
        consumer1.accept("world");

        //2 类::静态方法
        Comparator<Integer> com = (o1,o2) -> Integer.compare(o1,o2);
        Comparator<Integer> com1 = Integer::compareTo;

        //3 类::实例方法
        Function<Employee,String> function = e->e.getName();
        Function<Employee,String> function1 = Employee::getName;
        System.out.println(function.apply(new Employee("xiaoming",5000)));
        System.out.println(function1.apply(new Employee("xiaoming",5000)));

        //4 类::new
        Supplier<Employee> supplier = () -> new Employee();
        Supplier<Employee> supplier1 = Employee::new;
        Employee employee = supplier.get();
        System.out.println(employee.toString());
    }
}
