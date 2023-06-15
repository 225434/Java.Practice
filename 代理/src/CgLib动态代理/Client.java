package CgLib动态代理;

import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dog.class);
        enhancer.setCallback(new DogCglibProxy());
        Dog dog = (Dog) enhancer.create();
        dog.say();
    }
}
