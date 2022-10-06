package edabit.returnTheHighestAndLowestNumbers;

public class Program {

    public static void main(String[] args) {
        System.out.println(highLow("1 2 3 4 5"));
        System.out.println(highLow("1 9 3 4 -5"));
        System.out.println(highLow("13 13"));
    }

    static String highLow(String numbers) {
        String[] stringArray = numbers.split(" ");
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i ++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        int highestNum = intArray[0];
        int lowestNum = intArray[0];

        for (int i = 1; i < intArray.length; i ++) {
            if (intArray[i] > highestNum) {
                highestNum = intArray[i];
            }
            if (intArray[i] < lowestNum) {
                lowestNum = intArray[i];
            }
        }

        return highestNum + " " + lowestNum;
    }
}
