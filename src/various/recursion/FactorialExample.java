package various.recursion;

public class FactorialExample {

    // metoda na znalezienie silni bez rekurencji
    /*public static int getFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }*/

    // metoda z użyciem rekurencji
    public static int getFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        //System.out.println(getFactorial(5));
        //System.out.println(getFactorial(6) - getFactorial(4));
        System.out.println(getFactorial(3));
    }
}
