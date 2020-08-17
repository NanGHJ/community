package life.majiang.community.test.day17_5;

import life.majiang.community.test.day17_4.Gender;

/**
 * TODO
 *
 * @author 程碧泉
 * @history 2020/8/5 程碧泉 新建
 * @since JDK1.7
 */
public @interface MyAnnotation2 {
    //属性
    //1.字符串类型
    String value();
    //2.基本类型
    int age();
    //3.Class类型
    Class<?> class1();
    //4.枚举类型
    Gender gender();
    //5.注解类型
    MyAnnotation annotation();
}
