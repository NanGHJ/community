/**
 * Project Name:community
 * File Name:TestPersonUpdate
 * Package Name:life.majiang.community.test.Person1
 * Date:2020/8/12 15:44
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.Person1;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class TestPersonUpdate {
    public static void main(String[] args){
        PersonDapImpl personDap = new PersonDapImpl();
        Person person = new Person(1,"lisi",16,DateUtils.strToUtil("2004-04-01"),"684531681@qq.com","杭州市滨江区");
        int result = personDap.update(person);
        if(result == 1){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }
}
