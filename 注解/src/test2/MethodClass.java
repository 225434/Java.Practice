package test2;
public class MethodClass {
    int a = 3;
    int b = 2;
    int c = 0;

    @check(log = "current")
    public void add() {
        System.out.println(a + b);
    }

    @check(log = "current")
    public void subduction() {
        System.out.println(a - b);
    }

    @check(log = "current")
    public void multiplication() {
        System.out.println(a * b);
    }

    @check(log = "current")
    public void divide() {
        System.out.println(a / c);
    }

    public void say() {
        System.out.println("NO BUGS");
    }
}
