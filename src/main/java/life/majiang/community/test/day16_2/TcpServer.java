/**
 * Project Name:community
 * File Name:TcpServer
 * Package Name:life.majiang.community.test.day16_2
 * Date:2020/8/4 11:04
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day16_2;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * 使用TCP协议接受多个客户端请求
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class TcpServer {
    public static void main(String[] args) throws Exception{
        //1.创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(10086);
        //2.调用accept()方法，接受客户端请求
        System.out.println("服务器已启动......");
        while (true){
            Socket socket = serverSocket.accept();
            System.out.println(socket.getInetAddress()+"进来了......");
            //创建线程对象，负责接收数据
            new SocketThread(socket).start();
        }
    }
}
