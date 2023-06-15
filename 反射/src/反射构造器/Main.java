package 反射构造器;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("类.Animal");
        //获取无参的公有构造方法
        Constructor<?> constructor = c.getConstructor();
        System.out.println(constructor);
        Object object = constructor.newInstance();
        System.out.println(object);
        //获取带参的公有构造方法
        Constructor<?> constructor1 = c.getConstructor(String.class);
        System.out.println(constructor1);
        Object object1 = constructor1.newInstance("猫");
        System.out.println(object1);
        //获取带参的私有构造方法
        Constructor<?> constructor2 = c.getDeclaredConstructor(String.class,String.class);
        System.out.println(constructor2);
        constructor2.setAccessible(true);
        Object object2 = constructor2.newInstance("狗","旺财");
        System.out.println(object2);
    }
}
