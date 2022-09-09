package edabit.censoredStrings;

import java.util.Arrays;

public class Challenge {

    public static void main(String[] args) {

        System.out.println(uncensor("P*k*m*n", "oeo"));
        System.out.println(uncensor("Wh*r* d*d my v*w*ls g*?", "eeioeo"));
        System.out.println(uncensor("abcd", ""));
    }

    public static String uncensor(String censoredString, String removedVowels) {
        char[] censoredStringArray = censoredString.toCharArray();
        char[] removedVowelsArray = removedVowels.toCharArray();
        int asteriskCount = 0;
        for (char symbol : censoredStringArray) {
            if (symbol == '*') {
                asteriskCount ++;
            }
        }
        if (asteriskCount != removedVowels.length()) {
            throw new IllegalArgumentException("Invalid 1st or/and 2nd parameter");
        }
        for (int i = 0; i < censoredStringArray.length; i ++) {
            if (censoredStringArray[i] == '*') {
                censoredStringArray[i] = removedVowelsArray[0];
                removedVowelsArray = Arrays.copyOfRange(removedVowelsArray, 1, removedVowelsArray.length);
            }
        }
        return new String(censoredStringArray);
    }
}
