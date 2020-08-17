/**
 * Project Name:community
 * File Name:SocketThread
 * Package Name:life.majiang.community.test.day16_2
 * Date:2020/8/4 11:04
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day16_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class SocketThread extends Thread {
    private Socket socket;
    public SocketThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        if(socket != null){
            BufferedReader br = null;
            try {
                InputStream is = socket.getInputStream();
                br = new BufferedReader(new InputStreamReader(is,"utf-8"));
                while(true){
                    String data = br.readLine();
                    if(data == null){//客户端已关闭
                        break;
                    }
                    System.out.println(socket.getInetAddress()+"说："+data);
                    if(data.equals("886") || data.equals("byebye")){
                        break;
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                try {
                    br.close();
                    socket.close();
                    System.out.println(socket.getInetAddress()+"退出了......");
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }


    }
}
