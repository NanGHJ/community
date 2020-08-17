/**
 * Project Name:community
 * File Name:TcpFileClient
 * Package Name:life.majiang.community.test.day16_1
 * Date:2020/8/4 10:49
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day16_1;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP客户端
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class TcpFileClient {
    public static void main(String[] args) throws Exception{
        //1创建Socket
        Socket socket = new Socket("192.168.2.69",9999);
        //2获取输出流
        OutputStream os = socket.getOutputStream();
        //3边读取文件，边发送
        FileInputStream fis = new FileInputStream("d:\\001.png");
        byte[] buf = new byte[1024*4];
        int count = 0;
        while((count = fis.read(buf)) != -1){
            os.write(buf,0,count);
        }
        //4关闭
        os.close();
        fis.close();
        socket.close();
        System.out.println("发送完毕");
    }
}
