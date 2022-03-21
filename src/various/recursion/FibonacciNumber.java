package various.recursion;

public class FibonacciNumber {

    static int getFibonacciValue(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return getFibonacciValue(number - 1) + getFibonacciValue(number - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(getFibonacciValue(12));
    }
}
