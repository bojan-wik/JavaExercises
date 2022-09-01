package edabit.differenceOfMaxAndMinNumbersInArray;

public class Challenge {

    public static int differenceMaxMin(int[] numbers) {
        int minNumber = numbers[0];
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i ++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber - minNumber;
    }
}
