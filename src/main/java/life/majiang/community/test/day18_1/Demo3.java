/**
 * Project Name:community
 * File Name:Demo3
 * Package Name:life.majiang.community.test.day18_1
 * Date:2020/8/6 10:35
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/6 程碧泉 新建
 */
public class Demo3 {
    public static void main(String[] args){
        //匿名内部类
//        Consumer<Double> consumer = new Consumer<Double>() {
//            @Override
//            public void accept(Double money) {
//                System.out.println("聚餐消费："+money);
//            }
//        };
        //Lambda表达式
        Consumer<Double> consumer = money -> System.out.println("聚餐消费："+money);
        happy(consumer,1000);
        happy(money -> System.out.println("唱歌消费："+money),2000);
        happy(money -> System.out.println("足疗消费："+money),3000);

        //Lambda表达式
        int[] arr = getNums(() -> new Random().nextInt(100), 5);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = getNums(() -> new Random().nextInt(1000), 10);
        System.out.println(Arrays.toString(arr2));

        //Lambda表达式
        String result = handleString(s -> s.toUpperCase(), "hello");
        System.out.println(result);
        String result2 = handleString(s -> s.trim(), "    zhangsan  ");
        System.out.println(result2);

        //Lambda表达式
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");
        list.add("nangong");
        list.add("zhangjia");
        list.add("likui");
        List<String> result3 = filterNames(s -> s.length() > 6, list);
        System.out.println(result3.toString());
        List<String> result4 = filterNames(s -> s.startsWith("zhang"), list);
        System.out.println(result4.toString());
    }
    //Consumer   消费型接口
    public static void happy(Consumer<Double> comsumer, double money){
        comsumer.accept(money);
    }

    //Supplier  供给型接口
    public static int[] getNums(Supplier<Integer> supplier,int count){
        int[] arr = new int[count];
        for(int i=0;i<count;i++){
            arr[i] = supplier.get();
        }
        return arr;
    }

    //Function  函数型接口
    public static String handleString(Function<String,String> function,String str){
        return function.apply(str);
    }

    //Predicate 断言型接口
    public static List<String> filterNames(Predicate<String> predicate,List<String> list){
        List<String> resultList = new ArrayList<>();
        for (String string : list
             ) {
            if(predicate.test(string)){
                resultList.add(string);
            }
        }
        return resultList;
    }
}
