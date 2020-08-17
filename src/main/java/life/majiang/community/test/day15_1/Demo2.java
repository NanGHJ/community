/**
 * Project Name:community
 * File Name:Demo
 * Package Name:life.majiang.community.test.day15_1
 * Date:2020/7/23 9:51
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day15_1;

import java.io.FileOutputStream;

/**
 * 演示文件字节输出流的使用
 * FileOutputStream
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/23 程碧泉 新建
 */
public class Demo2 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\bbb.txt");
        //2.写入文件
//        fileOutputStream.write(97);
//        fileOutputStream.write('b');
//        fileOutputStream.write('c');
        String string = "helloworld";
        fileOutputStream.write(string.getBytes());
        //3.关闭
        fileOutputStream.close();
    }
}
