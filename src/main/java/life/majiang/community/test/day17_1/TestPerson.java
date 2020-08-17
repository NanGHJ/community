/**
 * Project Name:community
 * File Name:TestPerson
 * Package Name:life.majiang.community.test.day17_1
 * Date:2020/8/4 15:46
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.day17_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/4 程碧泉 新建
 */
public class TestPerson {
    public static void main(String[] args) throws Exception{
        //getClazz();
        //reflectOpe1();
        //reflectOpe2();
        //reflectOpe3();
//        Properties properties = new Properties();
////        properties.setProperty("username","zhangsan");
////        System.out.println(properties.toString());
//        invokeAny(properties,"setProperty",new Class[] {String.class , String.class},"username","张三");
//        System.out.println(properties.toString());
        reflectOpe4();
    }
    public static void getClazz() throws Exception{
        //1.使用实例对象获取类对象
        Person zhangsan = new Person();
        Class<?> class1 = zhangsan.getClass();
        System.out.println(class1.hashCode());
        //2.使用类名.class属性
        Class<?> class2 = Person.class;
        System.out.println(class2.hashCode());
        //3.使用Class的静态方法[推荐使用]
        Class<?> class3 = Class.forName("life.majiang.community.test.day17_1.Person");
        System.out.println(class3.hashCode());
    }

    //反射常见操作
    //1.使用反射获取类的名字、包名、父类、接口
    public static void reflectOpe1() throws Exception{
        //1.获取类对象Person
        Class<?> class1 = Class.forName("life.majiang.community.test.day17_1.Person");
        //getName()
        System.out.println(class1.getName());
        //getPackage()
        System.out.println(class1.getPackage().getName());
        //getSupperclass()
        System.out.println(class1.getSuperclass().getName());
        //getInterfaces()
        Class<?>[] classes = class1.getInterfaces();
        System.out.println(Arrays.toString(classes));
    }

    //2.使用反射获取类的构造方法，创建对象
    public static void reflectOpe2() throws Exception{
        //1.获取类的类对象
        Class<?> class1 = Class.forName("life.majiang.community.test.day17_1.Person");
        //2.获取类的构造方法Constructor
//        Constructor<?>[] constructors = class1.getConstructors();
//        for (Constructor<?> con : constructors
//             ) {
//            System.out.println(con.toString());
//        }
        //3.获取类中无参构造方法
        Constructor<?> con = class1.getConstructor();
        Object zhangsan = con.newInstance();
        System.out.println(zhangsan.toString());
        //简便方法：类对象.newInstance();
        Person wangwu = (Person) class1.newInstance();
        System.out.println(wangwu.toString());
        //4.获取类中的带参构造方法
        Constructor<?> con2 = class1.getConstructor(String.class, int.class);
        Object xiaowang = con2.newInstance("小王", 20);
        System.out.println(xiaowang.toString());
    }

    //3.使用反射获取类中的方法，并调用方法
    public static void reflectOpe3() throws Exception{
        //1.获取类对象
        Class<?> class1 = Class.forName("life.majiang.community.test.day17_1.Person");
        //2.获取方法Method对象
        //2.1 getMethods() 获取公开的方法，包括从父类继承的方法
//        Method[] methods = class1.getMethods();
        //2.2 getDeclaredMethods() 获取类中的所有方法，包括私有的、默认的、保护的，但不包含继承的方法
//        Method[] methods = class1.getDeclaredMethods();
//        for (Method method : methods
//             ) {
//            System.out.println(method.toString());
//        }
        //3.获取单个方法
        //3.1 无参eat()
        Method eatMethod = class1.getMethod("eat");
        //正常调用 Person zhangsan = new Person(); zhangsan.eat();
        //调用方法
        Person zhangsan = (Person) class1.newInstance();
        eatMethod.invoke(zhangsan);//zhangsan.eat()
        System.out.println("-------------------------");
        //3.2 toString()
        Method toStringMethod = class1.getMethod("toString");
        Object result = toStringMethod.invoke(zhangsan);
        System.out.println(result);
        System.out.println("-------------------------");
        //3.3 带参eat()
        Method eatMethod2 = class1.getMethod("eat", String.class);
        eatMethod2.invoke(zhangsan,"西瓜");
        System.out.println("-------------------------");
        //3.4 获取私有方法
        Method privateMethod = class1.getDeclaredMethod("privateMethod");
        //设置访问权限无效
        privateMethod.setAccessible(true);
        privateMethod.invoke(zhangsan);
        //3.5 获取静态方法
        Method staticMethod = class1.getMethod("staticMethod");
        //正常调用 Person.staticMethod()
        //调用静态方法
        staticMethod.invoke(null);//Person.staticMethod()
    }

    //4.使用反射实现一个可以调用任何对象方法的通用方法
    public static Object invokeAny(Object obj,String methodMethod,Class<?>[] types,Object...args) throws Exception{
        //1.获取类对象
        Class<?> class1 = obj.getClass();
        //2.获取方法
        Method method = class1.getMethod(methodMethod, types);
        //3.调用
        return method.invoke(obj,args);
    }

    //5.使用反射获取类中的属性
    public static void reflectOpe4() throws Exception{
        //1.获取类对象
        Class<?> class1 = Class.forName("life.majiang.community.test.day17_1.Person");
        //2.获取属性(字段)
        //2.1 getFields()公开的字段，父类继承的字段
        //Field[] fields = class1.getFields();
        //2.2 getDeclaredFields()获取所有属性，包括私有的、默认的、保护的，但不包含继承的字段
        Field[] fields = class1.getDeclaredFields();
        for (Field field : fields
             ) {
            System.out.println(field.toString());
        }
        //3. 获取name属性
        Field namefield = class1.getDeclaredField("name");
        namefield.setAccessible(true);
        //4. 赋值 正常调用 Person zhangsan = new Person(); zhangsan.name = "张三";
        Person zhangsan = (Person) class1.newInstance();
        namefield.set(zhangsan,"张三");//zhangsan.name = "张三";
        //5. 获取值
        System.out.println(namefield.get(zhangsan));//zhangsan.name
    }
}
