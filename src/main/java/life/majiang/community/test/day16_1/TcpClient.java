/**
 * Project Name:community
 * File Name:TcpClient
 * Package Name:life.majiang.community.test.day16_1
 * Date:2020/8/4 10:16
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day16_1;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * 基于TCP协议的客户端开发
 * 1 创建客户端套接字(Socket)，并指定服务器地址和端口号
 * 2 读取输出流，发送数据给服务端
 * 3 获取输入流，读取服务端发送的数据
 * 4 关闭释放资源
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class TcpClient {
    public static void main(String[] args) throws Exception{
//        1 创建客户端套接字(Socket)，并指定服务器地址和端口号
        Socket socket = new Socket("192.168.2.69",8899);
//        2 读取输出流，发送数据给服务端
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os,"utf-8"));
        bw.write("好久不见");
//        3 获取输入流，读取服务端发送的数据[可选]
//        4 关闭释放资源
        bw.close();
        socket.close();
    }
}
