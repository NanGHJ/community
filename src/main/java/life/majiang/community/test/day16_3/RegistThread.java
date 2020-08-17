/**
 * Project Name:community
 * File Name:RegistThread
 * Package Name:life.majiang.community.test.day16_3
 * Date:2020/8/4 14:14
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day16_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

/**
 * 实现注册功能
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class RegistThread extends Thread{
    @Override
    public void run() {
        try{
            //1.创建ServerSocket
            ServerSocket serverSocket = new ServerSocket(6666);
            //2.调用accept()方法
            System.out.println("注册服务器已启动......");
            Socket socket = serverSocket.accept();
            //3.获取输入输出流
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
            //4.接收客户端发送的数据{id:1001,name:tom,pwd:123,age:20}
            String json = br.readLine();
            String[] infos = json.substring(1, json.length() - 1).split(",");
            String id = infos[0].split(":")[1];
            //5.加载属性文件
            Properties properties = Tools.loadProperties();
            //6.判断
            if(properties.containsKey(id)){
                //有
                bw.write("此用户已存在");
            }else{
                //没有，并保存
                Tools.saveProperties(json);
                bw.write("注册成功");
            }
            bw.newLine();
            bw.flush();
            bw.close();
            br.close();
            socket.close();
            serverSocket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
