package HackerRank;
/**
 * https://www.hackerrank.com/challenges/java-output-formatting/problem
 */

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String string1 = scanner.nextLine();
            int int1 = scanner.nextInt();
            System.out.printf("%-15s %d", string1, int1).println();
        }
        System.out.println("================================");*/

        String string1 = "python";
        int int1 = 50;
        /**
         * In %-10s the %s defines the type String, the - is used for left-alignment and the 15 defines the width of the padding.
         * https://stackoverflow.com/a/48338454
         */
        /**
         * You just need to add "%03d" to add 3 leading zeros in an Integer.
         * It means if the number has 1 or 2 digits than some leading zeros will be added to the number to make its width equal to 3.
         * https://javarevisited.blogspot.com/2013/02/add-leading-zeros-to-integers-Java-String-left-padding-example-program.html#ixzz76duqXsc0
         */
        System.out.printf("%-15s%03d", string1, int1).println();
    }
}
