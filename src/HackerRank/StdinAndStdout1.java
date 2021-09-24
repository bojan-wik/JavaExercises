package HackerRank;
/**
 * https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
 */
/**
 * W Javie, aby zaczytać jakiś input, mogę do tego celu użyć klasy 'Scanner'.
 * Zaczytać tak mogę tylko primitive types, takie jak int, double, strings itp.
 */
import java.util.Scanner;

public class StdinAndStdout1 {

    public static void main(String[] args) {
        /**
         * Tworzę obiekt klasy Scanner, gdzie muszę podać argument.
         * Zazwyczaj podaje się predefiniowany obiekt 'System.in', który reprezentuje standardowy input stream.
         * Można tu podać także obiekt klasy File, jeśli chcemy zaczytywać input z zewn. plików.
         */
        Scanner scanner = new Scanner(System.in);
        /**
         * Aby zaczytac stringi używamy metody nextLine(), inty metody nextInt() itd.
         */
        String sampleString = scanner.nextLine();
        int sampleInt = scanner.nextInt();
        /**
         * Na końcu mogę zamknąć obiekt, ale nie jest to wymagane, z tego co widziałem.
         */
        scanner.close();
        /**
         * Potem printuję wartości.
         */
        System.out.println(sampleString);
        System.out.println(sampleInt);
    }
}
