/**
 * Project Name:community
 * File Name:Demo2
 * Package Name:life.majiang.community.test
 * Date:2020/7/20 10:30
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/20 程碧泉 新建
 */
public class Demo2 {
    public static void main(String[] args){
        Person person = new Person();
        Runnable add = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    synchronized (person){

                        person.setAge(person.getAge()+1000);
                        System.out.println(Thread.currentThread().getName()+"加了1000岁，年龄是"+person.getAge());
                    }
                }
            }
        };
        Runnable sub = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    synchronized (person){

                        if(person.getAge()>=1000){
                            person.setAge(person.getAge()-1000);
                            System.out.println(Thread.currentThread().getName()+"减了1000岁，年龄是"+person.getAge());

                        }else {
                            System.out.println("余额不足，请尽快充值");
                            i--;
                        }
                    }
                }
            }
        };
        new Thread(add,"明明").start();
        new Thread(sub,"丽丽").start();
    }
}
