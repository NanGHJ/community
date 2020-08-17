/**
 * Project Name:community
 * File Name:Tools
 * Package Name:life.majiang.community.test.day16_3
 * Date:2020/8/4 14:26
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day16_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 工具类
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class Tools {
    //1加载属性文件
    public static Properties loadProperties(){
        //1.创建属性集合
        Properties properties = new Properties();
        //2.判断文件是否存在
        File file = new File("users.properties");
        if(file.exists()){
            FileInputStream fis = null;
            try{
                fis = new FileInputStream(file);
                properties.load(fis);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if(fis != null){
                    try {
                        fis.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }

            }
        }

        return properties;
    }


    //2.保存
    public static void saveProperties(String json){
        String[] infos = json.substring(1, json.length() - 1).split(",");
        String id = infos[0].split(":")[1];
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("users.properties",true);
            Properties properties = new Properties();
            properties.setProperty(id,json);
            properties.store(fos,"");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(fos != null){
                try{
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
