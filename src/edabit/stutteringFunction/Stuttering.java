package edabit.stutteringFunction;

public class Stuttering {

    public static String stutter(String word) {
        if (word.length() < 2) {
            return "Input must be at least two-character long";
        }
        word = word.toLowerCase();
        String firstTwoLetters = word.substring(0, 2) + "... ";
        return firstTwoLetters + firstTwoLetters + word + "?";
    }
}
