/**
 * Project Name:community
 * File Name:Demo
 * Package Name:life.majiang.community.test.day17_4
 * Date:2020/8/5 14:27
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day17_4;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/5 程碧泉 新建
 */
public class Demo {
    public static void main(String[] args){
        Season season = Season.WINTER;
        //byte short int String 枚举
        switch (season){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
            default:
                break;
        }
    }
}
