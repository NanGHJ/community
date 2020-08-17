/**
 * Project Name:community
 * File Name:TcpServer
 * Package Name:life.majiang.community.test.day16_1
 * Date:2020/8/4 10:02
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day16_1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 基于TCP协议的服务端开发
 * 1 创建ServerSocket 并指定端口号
 * 2 调用accept()，接受客户端请求
 * 3 获取输入流，读取客户端发送的请求
 * 4 获取输出流，发送数据给客户端
 * 5 关闭释放资源
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class TcpServer {
    public static void main(String[] args) throws Exception{
//        1 创建ServerSocket 并指定端口号
        ServerSocket serverSocket = new ServerSocket(8899);
//        2 调用accept()，接受客户端请求
        System.out.println("服务器已启动---");
        Socket socket = serverSocket.accept();
//        3 获取输入流，读取客户端发送的请求
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
        String data = br.readLine();
        System.out.println("客户端发送："+data);
//        4 获取输出流，发送数据给客户端[可选]
//        5 关闭释放资源
        br.close();
        socket.close();
        serverSocket.close();
    }
}
