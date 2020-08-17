/**
 * Project Name:community
 * File Name:UserClient
 * Package Name:life.majiang.community.test.day16_3
 * Date:2020/8/4 14:46
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day16_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class UserClient {
    public static void main(String[] args) throws Exception{
        System.out.println("------请选择：1.注册  2.登录------");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice){
            case 1:
                regist();
                break;
            case 2:
                login();
                break;
            default:
                break;
        }
    }
    public static void regist() throws Exception{
        //1.创建Socket
        Socket socket = new Socket("192.168.2.69",6666);
        //2.获取流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
        //3.获取用户信息
        String json = getRegistInfo();
        //4.发送
        bw.write(json);
        bw.newLine();
        bw.flush();
        //5.接收
        String readLine = br.readLine();
        System.out.println("服务器回复："+readLine);
        //6.关闭
        bw.close();
        br.close();
        socket.close();
    }
    public static String getRegistInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户ID");
        int id = input.nextInt();
        System.out.println("请输入用户名称");
        String name = input.next();
        System.out.println("请输入用户密码");
        String pwd = input.next();
        System.out.println("请输入年龄");
        int age = input.nextInt();
        String json = "{id:"+id+",name:"+name+",pwd:"+pwd+",age:"+age+"}";
        return json;
    }

    public static void login() throws Exception{
        //1.创建Socket
        Socket socket = new Socket("192.168.2.69",7777);
        //2.获取流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
        //3.获取用户信息
        String json = getLoginInfo();
        //4.发送
        bw.write(json);
        bw.newLine();
        bw.flush();
        //5.接收
        String readLine = br.readLine();
        System.out.println("服务器回复："+readLine);
        //6.关闭
        bw.close();
        br.close();
        socket.close();
    }
    public static String getLoginInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户ID");
        int id = input.nextInt();
        System.out.println("请输入用户密码");
        String pwd = input.next();
        String json = "{id:"+id+",pwd:"+pwd+"}";
        return json;
    }
}
