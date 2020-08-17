package life.majiang.community.test.day17_5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * TODO
 *
 * @author 程碧泉
 * @history 2020/8/5 程碧泉 新建
 * @since JDK1.7
 */
@Retention(value = RetentionPolicy.RUNTIME)
public @interface PersonInfo {
    String name();
    int age();
    String sex();
}
