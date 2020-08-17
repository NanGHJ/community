/**
 * Project Name:community
 * File Name:Demo2
 * Package Name:life.majiang.community.test.day18_1
 * Date:2020/8/6 9:58
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_1;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/6 程碧泉 新建
 */
public class Demo2 {
    public static void main(String[] args){
        //匿名内部类
        Usb mouse = new Usb() {
            @Override
            public void service() {
                System.out.println("鼠标开始工作了...");
            }
        };
        //Lambda表达式
        Usb fan = () -> System.out.println("风扇开始运行了...");
        run(mouse);
        run(fan);
    }
    public static void run(Usb usb){
        usb.service();
    }
}
