/**
 * Project Name:community
 * File Name:Demo1
 * Package Name:life.majiang.community.test.day15_1
 * Date:2020/7/23 9:34
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day15_1;

import java.io.FileInputStream;

/**
 * 演示FileInputStream
 * 文字字节输入流
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/23 程碧泉 新建
 */
public class Demo1 {
    public static void main(String[] args) throws Exception{
        //1.创建FileInputStream，并指定文件路径
        FileInputStream fis = new FileInputStream("D:\\aaa.txt");
        //2.读取文件
        //2.1单个字节读取 fis.read()
        /*int data = 0;
        while((data = fis.read()) != -1){
            System.out.println((char) data);
        }*/
        //2.2多个字节读取
        int count = 0;
        byte[] buf = new byte[3];
        while((count = fis.read(buf)) != -1){
            System.out.println(new String(buf,0,count));
        }


        fis.close();
    }
}
