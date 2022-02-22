package edabit;

import java.util.Arrays;
import java.util.Collections;

public class ExistsANumberHigher {

    static boolean existsHigher(Integer[] array, int number) {
        Arrays.sort(array, Collections.reverseOrder());
        for (int element : array) {
            if (element >= number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Integer[] testArray1 = {5, 3, 15, 22, 4};
        Integer[] testArray2 = {1, 2, 3, 4, 5};
        Integer[] testArray3 = {4, 3, 3, 3, 2, 2, 2};
        Integer[] testArray4 = {};

        System.out.println(existsHigher(testArray1, 10));
        System.out.println(existsHigher(testArray2, 8));
        System.out.println(existsHigher(testArray3, 4));
        System.out.println(existsHigher(testArray4, 5));
    }
}
