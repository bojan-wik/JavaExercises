package edabit;

import java.util.Arrays;

/**
 * https://edabit.com/challenge/E2WdAPmgNJnbL5RvF
 */
public class ConcatTwoIntArrays {

    public static int[] concat(int[] array1, int[] array2) {
        int[] arrayConcatenated = new int[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < array1.length; i += 1) {
            arrayConcatenated[count] = array1[i];
            count += 1;
        }
        for (int j = 0; j < array2.length; j += 1) {
            arrayConcatenated[count] = array2[j];
            count += 1;
        }
        return arrayConcatenated;
    }

    public static void main(String[] args) {

        /*int[] array1 = {1, 3, 5};
        int[] array2 = {2, 6, 8};
        int[] arrayOutput = new int[array1.length + array2.length];

        int count = 0;

        for (int i = 0; i < array1.length; i += 1) {
            arrayOutput[count] = array1[i];
            count += 1;
        }
        for (int j = 0; j < array2.length; j += 1) {
            arrayOutput[count] = array2[j];
            count += 1;
        }*/

        System.out.println(Arrays.toString(concat(new int[]{1, 3, 5}, new int[]{2, 6, 8})));
        System.out.println(Arrays.toString(concat(new int[]{7, 8}, new int[]{10, 9, 1, 1, 2})));
        System.out.println(Arrays.toString(concat(new int[]{4, 5, 1}, new int[]{3, 3, 3, 3, 3})));
    }
}
