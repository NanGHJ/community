/**
 * Project Name:community
 * File Name:UsbFactory
 * Package Name:life.majiang.community.test.day17_2
 * Date:2020/8/5 10:38
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day17_2;

/**
 * 工厂类
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/5 程碧泉 新建
 */
public class UsbFactory {
    public static Usb createUsb(String type){
        Usb usb = null;
        Class<?> class1 = null;
        try{
            class1 = Class.forName(type);
            usb = (Usb) class1.newInstance();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return usb;
    }
}
