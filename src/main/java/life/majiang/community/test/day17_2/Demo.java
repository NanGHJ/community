/**
 * Project Name:community
 * File Name:Demo
 * Package Name:life.majiang.community.test.day17_2
 * Date:2020/8/5 10:42
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day17_2;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

/**
 * 客户程序
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/5 程碧泉 新建
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        System.out.println("------请选择：1鼠标 2风扇 3U盘 ------");
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("src:\\usb.properties");
        properties.load(fis);
        fis.close();
        Usb usb = UsbFactory.createUsb(properties.getProperty(choice));
        if(usb != null){
            System.out.println("购买成功");
            usb.service();
        }else {
            System.out.println("购买失败");
        }
    }
}
