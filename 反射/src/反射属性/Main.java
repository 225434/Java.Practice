package 反射属性;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception{
        Class<?> c = Class.forName("类.Pet");
        Object object = c.getConstructor().newInstance();
        //获取共有属性
        Field field = c.getField("kind");
        field.set(object,"猫");
        System.out.println("kind = " + field);
        //获取私有属性
        Field field1 = c.getDeclaredField("name");
        field1.setAccessible(true);
        field1.set(object,"喵喵");
        System.out.println("name = " + field1);
    }
}
