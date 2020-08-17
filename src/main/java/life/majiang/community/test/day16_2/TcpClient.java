/**
 * Project Name:community
 * File Name:TcpClient
 * Package Name:life.majiang.community.test.day16_2
 * Date:2020/8/4 11:18
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day16_2;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP客户端
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class TcpClient {
    public static void main(String[] args) throws Exception{
        //1创建Socket
        Socket socket = new Socket("192.168.2.69",10086);
        //2获取输出流
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os,"utf-8"));
        //3控制输入
        Scanner input = new Scanner(System.in);
        while (true){
            String data =input.nextLine();
            bw.write(data);
            bw.newLine();
            bw.flush();
            if(data.equals("886") || data.equals("byebye")){
                break;
            }
        }
        //4关闭
        bw.close();
        socket.close();
    }
}
