/**
 * Project Name:community
 * File Name:Person
 * Package Name:life.majiang.community.test
 * Date:2020/7/14 15:31
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/7/14 程碧泉 新建
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(@NotNull Person o) {
        int n1 = this.getName().compareTo(o.getName());
        int n2 = this.age - o.getAge();
        return n1 == 0 ? n2 : n1;
    }
}
