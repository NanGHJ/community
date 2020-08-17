/**
 * Project Name:community
 * File Name:TestSingleTon
 * Package Name:life.majiang.community.test.day17_3
 * Date:2020/8/5 11:18
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day17_3;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/5 程碧泉 新建
 */
public class TestSingleTon {
    public static void main(String[] args){
        for (int i=0;i<3;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SingleTon3.getInstance().hashCode());
                }
            }).start();
        }
    }
}
