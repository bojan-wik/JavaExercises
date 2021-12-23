package edabit;

public class GetWordCount {

    public static int countWords(String sentence) {
        return sentence.split(" ").length;
    }

    public static void main(String[] args) {

        /*String sentence = "This is a test elo elo";
        String[] array = sentence.split(" ");
        System.out.println(array.length);

        int wordsCounter = sentence.split(" ").length;
        System.out.println(wordsCounter);*/

        System.out.println(countWords("What an easy task, right"));
    }
}
