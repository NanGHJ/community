/**
 * Project Name:community
 * File Name:Demo1
 * Package Name:life.majiang.community.test
 * Date:2020/7/13 9:40
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/13 程碧泉 新建
 */
public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        System.out.println("排序之前:" + list.toString());
        Collections.sort(list);
        System.out.println("排序之后:" + list.toString());

        int i1 = Collections.binarySearch(list, 40);
        System.out.println(i1);

        List<Integer> dest = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            dest.add(0);
        }
        Collections.copy(dest,list);
        System.out.println("复制之后：" + dest.toString());
        Collections.reverse(list);
        System.out.println("翻转之后：" + list.toString());

        Collections.shuffle(list);
        System.out.println("打乱之后："+ list.toString());

        //将集合转成数组
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(arr.length +" \t "+ Arrays.toString(arr));
        //将数组转成集合,此集合为受限集合，不能添加和删除元素
        String[] names = {"abc","bcd","cde"};
        List<String> list1 = Arrays.asList(names);
        //list1.add("def");
        //list1.remove(0);
        System.out.println(list1.toString());

        //把基本类型数组转化成集合时，需要修改为包装类
        Integer[] nums = {100,200,300,400,500};
        List<Integer> list2 = Arrays.asList(nums);
        System.out.println(list2);
    }
}
