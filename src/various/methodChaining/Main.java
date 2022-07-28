package various.methodChaining;

public class Main {

    public static void main(String[] args) {
        Example example = new Example();
        example.setInt(5).setFloat(2).display();
    }
}
