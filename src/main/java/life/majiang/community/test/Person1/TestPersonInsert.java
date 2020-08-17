/**
 * Project Name:community
 * File Name:TestPerson
 * Package Name:life.majiang.community.test.Person1
 * Date:2020/8/12 15:32
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.Person1;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class TestPersonInsert {
    public static void main(String[] args){
        //测试新增
        PersonDapImpl personDap = new PersonDapImpl();
        Person person = new Person("zhangsan",18,DateUtils.strToUtil("1998-06-01"),"21612156123@qq.com","杭州市西湖区三墩镇");
        int result = personDap.insert(person);
        if(result == 1){
            System.out.println("新增成功");
        }else {
            System.out.println("新增失败");
        }
    }
}
