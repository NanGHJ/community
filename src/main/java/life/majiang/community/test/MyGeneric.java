/**
 * Project Name:community
 * File Name:MyGeneric
 * Package Name:life.majiang.community.test
 * Date:2020/7/14 14:11
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/14 程碧泉 新建
 */

public class MyGeneric{
    public static void main(String[] args){
        int myArray[] = {1,2,3,4,5};
        ChangeIt.doIt(myArray);
        for (int i=0;i<myArray.length-1;i++){
            System.out.println(myArray[i]+" ");
        }
    }

}
class ChangeIt{
    static void doIt(int[] z){
        int A[] = z;
        A[0] = 99;
    }
}