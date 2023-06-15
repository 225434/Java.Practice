package 反射方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        Class<?> c = Class.forName("类.Animal");
        //获取共有方法并使用
        Method method = c.getMethod("say");
        Object object = c.getConstructor().newInstance();
        method.invoke(object);
        //获取私有方法并使用
        Constructor<?> constructor = c.getDeclaredConstructor(String.class,String.class);
        constructor.setAccessible(true);
        Method method1 = c.getDeclaredMethod("call");
        method1.setAccessible(true);
        Object object1 = constructor.newInstance("狗","汪汪");
        method1.invoke(object1);
    }
}
