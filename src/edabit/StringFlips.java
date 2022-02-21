package edabit;

/**
 * https://edabit.com/challenge/uemLKqbbbfqvwB8ke
 */
public class StringFlips {

    public static String wordFlip(String str) {
        String strFlipped = "";
        String[] strSplit = str.split(" ");
        for (int i = 0; i < strSplit.length; i += 1) {
            char[] letters = strSplit[i].toCharArray();
            char[] lettersFlipped = new char[letters.length];
            int counter = 1;
            for (int j = 0; j < letters.length; j += 1) {
                lettersFlipped[j] = letters[letters.length - counter];
                counter += 1;
            }
            String wordFlipped = String.valueOf(lettersFlipped);
            strFlipped = strFlipped + " " + wordFlipped;
        }
        return strFlipped;
    }

    public static String sentenceFlip(String str) {
        String sentenceFlipped;
        String[] strSplit = str.split(" ");
        String[] sentenceFlippedInArray = new String[strSplit.length];
        for (int i = 0; i < strSplit.length; i += 1) {
            sentenceFlippedInArray[i] = strSplit[strSplit.length - (i+1)];
        }
        sentenceFlipped = String.join(" ", sentenceFlippedInArray);
        return sentenceFlipped;
    }

    public static String flip(String str, String specification) {
        String strFlipped;
        switch(specification) {
            case "word":
                strFlipped = wordFlip(str);
                break;
            case "sentence":
                strFlipped = sentenceFlip(str);
                break;
            default:
                strFlipped = "Invalid specification. Use 'word' or 'sentence'.";
        }
        return strFlipped;
    }

    public static void main(String[] args) {

        String str = "Hello";
        String str1 = "There's never enough time to do all the nothing you want";

        /*System.out.println(wordFlip(str));
        System.out.println(sentenceFlip(str));
        System.out.println(wordFlip(str1));
        System.out.println(sentenceFlip(str1));*/

        System.out.println(flip(str, "sentence"));
    }
}
