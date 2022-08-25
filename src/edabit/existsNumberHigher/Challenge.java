package edabit.existsNumberHigher;

public class Challenge {

    public static boolean existsHigher(int[] numbers, int n) {
        for (int number : numbers) {
            if (number >= n) {
                return true;
            }
        }
        return false;
    }
}
