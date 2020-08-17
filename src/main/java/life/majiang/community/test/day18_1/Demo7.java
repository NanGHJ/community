/**
 * Project Name:community
 * File Name:Demo7
 * Package Name:life.majiang.community.test.day18_1
 * Date:2020/8/10 10:52
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_1;

import java.util.ArrayList;
import java.util.UUID;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/10 程碧泉 新建
 */
public class Demo7 {
    public static void main(String[] args){
        //串行流与并行流的比较
        ArrayList<String> list = new ArrayList<>();
        for (int i=0;i<500000;i++){
            list.add(UUID.randomUUID().toString());
        }
        long start = System.currentTimeMillis();
        list.stream().sorted().count();
        long end = System.currentTimeMillis();
        System.out.println("用时1："+(end-start));

        long start1 = System.currentTimeMillis();
        list.parallelStream().sorted().count();
        long end1 = System.currentTimeMillis();
        System.out.println("用时2："+(end1-start1));
    }
}
