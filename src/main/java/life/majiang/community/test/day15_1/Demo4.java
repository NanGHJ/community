/**
 * Project Name:community
 * File Name:Demo4
 * Package Name:life.majiang.community.test.day15_1
 * Date:2020/7/23 10:13
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day15_1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * 演示字节缓冲输出流的使用
 * BufferedOutputStream
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/23 程碧泉 新建
 */
public class Demo4 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("d:\\buffer.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        for(int i=0;i<10;i++){
            bos.write("helloworld".getBytes());
            bos.flush();
        }
        bos.close();
    }
}
