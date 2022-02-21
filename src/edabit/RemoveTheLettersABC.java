package edabit;

public class RemoveTheLettersABC {

    static String removeABC(String sentence) {
        String output = "";
        boolean doesContainABC = sentence.contains("a") || sentence.contains("b") || sentence.contains("c");
        if (doesContainABC) {
            output = sentence.replaceAll("([a-c])", "");
        }
        return output;
    }

    public static void main(String[] args) {

        String str1 = "Tesha is my world";
        String str2 = "This might be a bit hard";
        String str3 = "hello world!";
        String str4 = "";

        System.out.println(removeABC(str2));
    }
}