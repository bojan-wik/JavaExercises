package edabit.stateNamesAndAbbreviations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Challenge {

    public static void main(String[] args) {
        filterStateNames(new String[]{"Arizona", "CA", "NY", "Nevada"}, "abb");
    }

    /**
     * z użyciem stream()
     */
    public static String[] filterStateNames(String[] array, String parameter) {
        Stream<String> streamArray = Arrays.stream(array);
        String[] filteredArray;
        switch(parameter) {
            case "abb":
                filteredArray = streamArray.filter(element -> element.length() <= 2).toArray(String[]::new);
                break;
            case "full":
                filteredArray = streamArray.filter(element -> element.length() > 2).toArray(String[]::new);
                break;
            default:
                throw new IllegalStateException("Invalid 2nd parameter");
        }
        return filteredArray;
    }

    /**
     * z użyciem ArrayList
     */
//    public static String[] filterStateNames(String[] array, String parameter) {
//        ArrayList<String> filteredArrayList = new ArrayList<>();
//        switch(parameter) {
//            case "abb":
//                for (String element : array) {
//                    if (element.length() <= 2) {
//                        filteredArrayList.add(element);
//                    }
//                }
//                break;
//            case "full":
//                for (String element : array) {
//                    if (element.length() > 2) {
//                        filteredArrayList.add(element);
//                    }
//                }
//                break;
//            default:
//                throw new IllegalStateException("Invalid 2nd parameter");
//        }
//        return filteredArrayList.toArray(new String[filteredArrayList.size()]);
//    }

    /**
     * z użyciem Array, ale chyba się nie da/nie ma sensu
     */
//    public static String[] filterStateNames1(String[] array, String parameter) {
//
//        String[] filteredArray;
//        int stateAbbreviationsCount = 0;
//        int stateNamesCount = 0;
//
//        for (String element : array) {
//            if (element.length() <= 2) {
//                stateAbbreviationsCount += 1;
//            } else {
//                stateNamesCount += 1;
//            }
//        }
//
//        switch(parameter) {
//            case "abb":
//                filteredArray = new String[stateAbbreviationsCount];
//                break;
//            case "full":
//                filteredArray = new String[stateNamesCount];
//                break;
//            default:
//                throw new IllegalStateException("Invalid parameter");
//        }
//
//        return filteredArray;
//    }
}
