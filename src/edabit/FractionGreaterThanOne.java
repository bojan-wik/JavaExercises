package edabit;

public class FractionGreaterThanOne {

    public static boolean greaterThanOne(String fraction) {
        String[] fractionSplit = fraction.split("/");
        int numA = Integer.parseInt(fractionSplit[0]);
        int numB = Integer.parseInt(fractionSplit[1]);
        return numA > numB;
    }

    public static void main(String[] args) {

        final String FRACTION = "10/10";

        //String[] fractionArray = fraction.split("/");

        /*String numAstring = fractionArray[1];
        String numBstring = fractionArray[1];
        int numA = Integer.parseInt(numAstring);
        int numB = Integer.parseInt(numBstring);*/

        //int numA = Integer.parseInt(fractionArray[0]);
        //int numB = Integer.parseInt(fractionArray[1]);

        /*System.out.println(numA);
        System.out.println(numA > numB);*/

        System.out.println(greaterThanOne(FRACTION));
    }
}
