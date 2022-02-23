package edabit;

/**
 * https://edabit.com/challenge/MsJzAHPmmmcwF4iCr
 */
public class ReturnIndexOfTheFirstVowel {

    public static void firstVowel(String word) {
        char[] letters = word.toLowerCase().toCharArray();
        for (int i = 0; i < letters.length; i++) {
            System.out.printf("%d %s", i, letters[i]).println();
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {

        //firstVowel("apple");
        //firstVowel("hello");
        //firstVowel("STRAWBERRY");
        firstVowel("pInEaPPLe");
    }
}
