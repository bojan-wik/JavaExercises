package various.gftRozmowaTech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        getNumbersDivisibleByThree(new int[]{2, 3, 5, 9});
        getNumbersDivisibleByThree(new int[]{3, 6, 2, 12, 5, 10});
    }

//    public static int[] getNumbersDivisibleByThree(int[] numbers) {
//        List<Integer> numbersList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//        for (int i = 0; i < numbersList.size(); i ++) {
//            if (numbersList.get(i) % 3 != 0) {
//                numbersList.remove(i);
//            }
//        }
//        int[] array = numbersList.stream().mapToInt(i -> i).toArray();
//        System.out.println(Arrays.toString(array));
//        return array;
//    }

    public static int[] getNumbersDivisibleByThree(int[] numbers) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int number : numbers) {
            if (number % 3 == 0) {
                numbersList.add(number);
            }
        }
        int[] array = numbersList.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(array));
        return array;
    }
}
