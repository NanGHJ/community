/**
 * Project Name:community
 * File Name:Demo3
 * Package Name:life.majiang.community.test.day15_1
 * Date:2020/7/23 10:05
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day15_1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * 演示字节缓冲输入流的使用
 * BufferedInputStream
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/23 程碧泉 新建
 */
public class Demo3 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("d:\\aaa.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int data = 0;
        while ((data = bis.read()) != -1){
            System.out.println((char) data);
        }
        bis.close();
    }
}
