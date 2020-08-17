/**
 * Project Name:community
 * File Name:TestPersonDelete
 * Package Name:life.majiang.community.test.Person1
 * Date:2020/8/12 15:50
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.Person1;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class TestPersonDelete {
    public static void main(String[] args){
        PersonDapImpl personDap = new PersonDapImpl();
        int result = personDap.delete(1);
        if(result == 1){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
}
