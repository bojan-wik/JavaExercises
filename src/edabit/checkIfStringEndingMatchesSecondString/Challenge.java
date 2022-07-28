package edabit.checkIfStringEndingMatchesSecondString;

public class Challenge {

    public static boolean checkEnding(String first, String second) {
//        return first.substring(first.length() - second.length()).equals(second);
        return first.endsWith(second);
    }
}
