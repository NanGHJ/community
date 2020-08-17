/**
 * Project Name:community
 * File Name:Demo6
 * Package Name:life.majiang.community.test.day15_1
 * Date:2020/7/23 10:23
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day15_1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 使用ObjectOutputStream实现对象的序列化
 * 要求：1.序列化类必须要实现Serializable接口
 *      2.序列化类对象属性也要求实现Serializable接口
 *      3.序列化版本号ID，保证序列化的类和反序列化的类是同一个类
 *      4.使用transient(瞬间的)修饰属性，这个属性不能序列化
 *      5.静态属性不能序列化
 *      6.序列化多个对象，可以借助集合来实现
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/23 程碧泉 新建
 */
public class Demo6 {
    public static void main(String[] args) throws Exception{
        //1.创建对象流
        FileOutputStream fos = new FileOutputStream("d:\\student.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //2.序列化
//        Student zhangsan = new Student("张三",20);
//        oos.writeObject(zhangsan);
        //2.1序列化多个对象
        Student zhangsan = new Student("张三",20);
        Student lisi = new Student("李四",18);
        Student wangwu = new Student("王五",22);
        ArrayList<Student> list = new ArrayList<>();
        list.add(zhangsan);
        list.add(lisi);
        list.add(wangwu);
        oos.writeObject(list);
        //3.关闭
        oos.close();
        System.out.println("执行完毕");
    }
}
