package Jdk动态代理;

public class Cat implements Pet{
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Hello!" + name);
    }
}
