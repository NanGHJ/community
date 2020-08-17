/**
 * Project Name:community
 * File Name:Demo7
 * Package Name:life.majiang.community.test.day15_1
 * Date:2020/7/23 10:38
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day15_1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * 演示ObjectInputStream实现反序列化(读取重构成对象)
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/23 程碧泉 新建
 */
public class Demo7 {
    public static void main(String[] args) throws Exception{
        //1.创建对象
        FileInputStream fis = new FileInputStream("d:\\student.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //2.读取文件
//        Student student = (Student) ois.readObject();

        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        //3.关闭
        ois.close();
        System.out.println("执行完毕");
        System.out.println(list.toString());
    }
}
