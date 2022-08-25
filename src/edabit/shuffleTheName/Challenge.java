package edabit.shuffleTheName;

public class Challenge {

    public static String nameShuffle(String firstAndLastName) {
        //1st approach
//        String[] array = firstAndLastName.split(" ");
//        String[] arrayReversed = {array[1], array[0]};
//        return String.join(" ", arrayReversed);

        //2nd approach
        String firstName = firstAndLastName.substring(0, firstAndLastName.indexOf(" ")).trim();
        String lastName = firstAndLastName.substring((firstAndLastName.indexOf(" "))).trim();
        return lastName + " " + firstName;
    }
}
