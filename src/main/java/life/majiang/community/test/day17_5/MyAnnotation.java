package life.majiang.community.test.day17_5;

/**
 * 创建注解类型 @interface
 *
 * @author 程碧泉
 * @history 2020/8/5 程碧泉 新建
 * @since JDK1.7
 */
public @interface MyAnnotation {
    String name() default "张三";
    int age() default 20;
}
