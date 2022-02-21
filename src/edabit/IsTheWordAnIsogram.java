package edabit;

import java.util.Arrays;
import java.util.HashSet;

/**
 * https://edabit.com/challenge/AYQPBDjDbrrvJtjjc
 */
public class IsTheWordAnIsogram {

    /*public static boolean isIsogram(String word) {
        word = word.trim();
        if (!word.contains(" ")) {
            char[] letters = word.toLowerCase().toCharArray();
            int numOfRepeatingChars = 0;
            for (int i = 0; i < letters.length; i++) {
                for (int j = i + 1; j < letters.length; j++) {
                    if (letters[i] == letters[j]) {
                        numOfRepeatingChars ++;
                    }
                }
            }
            if (numOfRepeatingChars == 0) {
                System.out.println("The Word is an isogram");
                return true;
            } else {
                System.out.println("The Word is NOT an isogram");
                return false;
            }
        } else {
            System.out.println("Invalid input - it has more than one word.");
            return false;
        }
    }*/

    public static boolean isIsogram(String word) {
        char[] letters = word.toLowerCase().toCharArray();
        Arrays.sort(letters);
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] == letters[i + 1]) {
                System.out.printf("The Word '%s' is NOT an isogram", word);
                return false;
            }
        }
        System.out.printf("The Word '%s' is an isogram", word);
        return true;
    }

    public static void main(String[] args) {
        isIsogram("PasSword");
    }
}
