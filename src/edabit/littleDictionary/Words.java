package edabit.littleDictionary;

import java.util.ArrayList;

public class Words {

    public static void main(String[] args) {
        dictionary("bu", new String[]{"button", "breakfast", "buka"});
    }

    public static String[] dictionary(String initWord, String[] words) {
        if (words.length == 0) {
            throw new IllegalArgumentException("Words array cannot be empty");
        }
        ArrayList<String> wordsList = new ArrayList<>();
        for (String word : words) {
            if (word.startsWith(initWord)) {
                wordsList.add(word);
            }
        }
        return wordsList.toArray(new String[wordsList.size()]);
    }
}
