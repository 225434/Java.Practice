package 类;

public class Pet {
    public String kind;
    private String name;

    public Pet() {
    }

    public Pet(String kind, String name, int age) {
        this.kind = kind;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "kind='" + kind + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
