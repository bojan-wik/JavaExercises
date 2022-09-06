package edabit.warOfNumbers;

public class Challenge {

    public static void main(String[] args) {
        System.out.println(warOfNumbers(new int[] {2, 8, 7, 5}));
    }

    public static int warOfNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number <= 0) {
                throw new IllegalArgumentException("Array must contain only positive numbers");
            }
        }

        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumOfEvenNumbers += number;
            } else {
                sumOfOddNumbers += number;
            }
        }

        if (sumOfEvenNumbers >= sumOfOddNumbers) {
            return sumOfEvenNumbers - sumOfOddNumbers;
        } else {
            return sumOfOddNumbers - sumOfEvenNumbers;
        }
    }
}
