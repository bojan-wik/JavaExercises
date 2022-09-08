package edabit.recursionArraySum;

import java.util.Arrays;

public class Program {

    /**
     * rozwiązanie z rekursją
     */
    public static int sum(int[] numbers) {
        if (numbers.length <= 0) {
            return 0;
        } else {
            return numbers[0] + sum(Arrays.copyOfRange(numbers, 1, numbers.length));
        }
    }

    /**
     * rozwiązanie bez rekursji
     */
//    public static int sum(int[] numbers) {
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        return sum;
//    }
}
