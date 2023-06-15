package 反射类;

import 类.Animal;

public class Main {
    public static void main(String[] args) {
        //getClass()方法
        Animal animal = new Animal();
        Class<?> c = animal.getClass();
        System.out.println(c.getName());
        //静态class属性
        Class<?> c1 = Animal.class;
        System.out.println(c1.getName());
        //forName()方法
        try {
            Class<?> c2 = Class.forName("类.Animal");
            System.out.println(c2.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //基本数据类型
        Class<?> c3 = int.class;
        System.out.println(c3.getName());
        //基本数据类型的包装类
        Class<?> c4 = Integer.TYPE;
        System.out.println(c4.getName());
    }
}
