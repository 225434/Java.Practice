package 类;

public class Animal {
    String kind = "猫";
    private String name = "蓉华";

    public Animal() {
    }

    public Animal(String kind) {
        this.kind = kind;
    }

    private Animal(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "kind='" + kind + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void say() {
        System.out.println("Hello!," + kind);
    }

    private void call() {
        System.out.println("Come!" + name);
    }
}
