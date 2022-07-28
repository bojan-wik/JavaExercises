package various.methodChaining;

public class Example {

    private int a;
    private float b;

    Example() {
        System.out.println("calling the constructor");
    }

    public Example setInt(int a) {
        this.a = a;
        return this;
    }

    public Example setFloat(float b) {
        this.b = b;
        return this;
    }

    void display() {
        System.out.println("Display: a = " + a + ", b: = " + b);
    }
}
