package edabit.stateNamesAndAbbreviations;

import java.util.ArrayList;

public class Challenge {

    public static String[] filterStateNames(String[] array, String parameter) {

        ArrayList<String> filteredArrayList = new ArrayList<>();
        switch(parameter) {
            case "abb":
                for (String element : array) {
                    if (element.length() <= 2) {
                        filteredArrayList.add(element);
                    }
                }
                break;
            case "full":
                for (String element : array) {
                    if (element.length() > 2) {
                        filteredArrayList.add(element);
                    }
                }
                break;
            default:
                throw new IllegalStateException("Invalid 2nd parameter");
        }

        return filteredArrayList.toArray(new String[filteredArrayList.size()]);
    }

    // TODO: 06.09.2022 da się to jeszcze jakoś skrócić/zoptymalizować?
    // TODO: 06.09.2022 napisać drugą metodę z wykorzystaniem stream()

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
