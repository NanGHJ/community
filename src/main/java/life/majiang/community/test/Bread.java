/**
 * Project Name:community
 * File Name:BackCard
 * Package Name:life.majiang.community.test
 * Date:2020/7/21 14:04
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/21 程碧泉 新建
 */
public class Bread {
    private int id;
    private String productName;
    public Bread(){

    }
    public Bread(int id,String productName){
        super();
        this.id = id;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Bread{" + "id=" + id + ", productName='" + productName + '\'' + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
