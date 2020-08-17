/**
 * Project Name:community
 * File Name:Employee
 * Package Name:life.majiang.community.test.day18_1
 * Date:2020/8/10 9:27
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day18_1;

import java.util.Objects;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/10 程碧泉 新建
 */
public class Employee {
    private String name;
    private double money;

    public Employee() {
    }

    public Employee(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.money, money) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money);
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", money=" + money + '}';
    }
}
