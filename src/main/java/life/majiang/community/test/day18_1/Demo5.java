/**
 * Project Name:community
 * File Name:Demo5
 * Package Name:life.majiang.community.test.day18_1
 * Date:2020/8/10 9:48
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/10 程碧泉 新建
 */
public class Demo5 {
    public static void main(String[] args){
        //1 Collection对象中的stream()和parallelStream()方法
        ArrayList<String> list = new ArrayList<>();
        list.add("huawei");
        list.add("apple");
        list.add("xiaomi");
        Stream<String> stream = list.stream();
        //遍历
        //stream.forEach(s -> System.out.println(s));
        stream.forEach(System.out::println);

        //2 Arrays工具类stream方法
        String[] arr = {"aaa","bbb","ccc"};
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println);

        //3 Stream接口中的of、iterate、generate方法
        Stream<Integer> stream2 = Stream.of(10,20,30,40,50);
        stream2.forEach(System.out::println);
        //迭代流
        System.out.println("------迭代流------");
        Stream<Integer> iterate = Stream.iterate(0,x->x+2);
        iterate.limit(5).forEach(System.out::println);
        //生成流
        System.out.println("------生成流------");
        Stream<Integer> generate = Stream.generate(() -> new Random().nextInt(100));
        generate.limit(10).forEach(System.out::println);

        //4 IntStream,LongStream,DoubleStream 的of、range、rangeClosed
        IntStream stream3 = IntStream.of(100, 200, 300);
        stream3.forEach(System.out::println);
        //range 含头不含尾
        IntStream range = IntStream.range(0, 10);
        range.forEach(System.out::println);
        //rangeClosed 含头含尾
        IntStream rangeClosed = IntStream.rangeClosed(0, 10);
        rangeClosed.forEach(System.out::println);
    }
}
