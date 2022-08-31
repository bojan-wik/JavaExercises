package edabit.captureTheRook;

public class Challenge {

    private static boolean isInputValid(String[] rooks) {
        String regex = "^[a-hA-H][1-8]$";
        return rooks.length == 2 && (rooks[0].matches(regex) && rooks[1].matches(regex));
    }

    public static boolean canCapture(String[] rooks) {
        if (isInputValid(rooks)) {
            boolean isTheRowTheSame = rooks[0].substring(0, 1).equals(rooks[1].substring(0, 1));
            boolean isTheColumnTheSame = rooks[0].substring(1, 2).equals(rooks[1].substring(1, 2));
            return isTheRowTheSame || isTheColumnTheSame;
        }
        else {
            System.out.println("Invalid input");
            return false;
        }
    }
}
