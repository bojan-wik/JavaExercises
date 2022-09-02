package edabit.returnTheEndLettersOfNumbers;

public class Challenge {

    public static void main(String[] args) {
        System.out.println(returnTheEndOfNumber(553));
        System.out.println(returnTheEndOfNumber(34));
    }

    public static String returnTheEndOfNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }

        String suffix = "";
        int lastTwoDigits = number % 100;
        int lastDigit = lastTwoDigits % 10;

        switch(lastDigit) {
            case 1:
                suffix = "-ST";
                break;
            case 2:
                suffix = "-ND";
                break;
            case 3:
                suffix = "-RD";
                break;
            default:
                suffix = "-TH";
                break;
        }
        if (lastTwoDigits >= 11 && lastTwoDigits <= 13 ) {
            suffix = "-TH";
        }

        return number + suffix;
    }
}
