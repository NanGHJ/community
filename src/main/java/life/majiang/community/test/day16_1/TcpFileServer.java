/**
 * Project Name:community
 * File Name:TcpFileServer
 * Package Name:life.majiang.community.test.day16_1
 * Date:2020/8/4 10:42
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day16_1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务器
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class TcpFileServer {
    public static void main(String[] args) throws Exception{
        //1创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(9999);
        //2侦听，接收客户端请求
        System.out.println("服务器已启动");
        Socket socket = serverSocket.accept();
        //3获取输入流
        InputStream is = socket.getInputStream();
        //4边读取，边保存
        FileOutputStream fos = new FileOutputStream("d:\\002.png");
        byte[] buf = new byte[1024*4];
        int count = 0;
        while((count = is.read(buf)) != -1){
            fos.write(buf,0,count);
        }
        //5关闭
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
        System.out.println("接收完毕");
    }
}
