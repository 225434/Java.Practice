package Jdk动态代理;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Cat cat = new Cat("猫猫");
        JdkProxy<Cat> jdkProxy = new JdkProxy<>(cat);
        ClassLoader classLoader = cat.getClass().getClassLoader();
        Class<?>[] aClass = cat.getClass().getInterfaces();
        Pet pet = (Pet) Proxy.newProxyInstance(classLoader,aClass,jdkProxy);
        pet.say();
    }
}
