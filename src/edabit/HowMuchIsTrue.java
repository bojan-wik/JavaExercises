package edabit;

/**
 * https://edabit.com/challenge/vKpGt4ufSKmEJ3Xjd
 */

public class HowMuchIsTrue {

    public static int countTrue(boolean[] array) {
        int trueValueCounter = 0;
        for (boolean element : array) {
            if (element == true) {
                trueValueCounter += 1;
            }
        }
        return trueValueCounter;
    }

    public static int countTrue1(boolean[] array) {
        int trueValueCounter = 0;
        for (int i = 0; i < array.length; i += 1) {
            if (array[i] == true) {
                trueValueCounter += 1;
            }
        }
        return trueValueCounter;
    }

    public static void main(String[] args) {

        /*boolean[] myArray = {};
        int trueValueCounter = 0;
        for (int i = 0; i < myArray.length; i += 1) {
            if (myArray[i] == true) {
                trueValueCounter += 1;
            }
        }
        System.out.println(trueValueCounter);*/

        //System.out.println(countTrue(new boolean[]{true, false, false}));
        System.out.println(countTrue(new boolean[]{false, false, false}));
    }
}
