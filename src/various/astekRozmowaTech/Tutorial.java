package various.astekRozmowaTech;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.Math.abs;
import static java.lang.Math.max;

public class Tutorial {

    public static void main(String[] args) {

//        int[] ints = {-9, 14, 37, 102};
//        System.out.println(exists(ints, 102));
//        System.out.println(exists(ints, 36));

        computeClosestToZero(new int[] {2, 3, -2, 1});

    }

    public static void computeClosestToZero(int[] ts) {
//        if (ts.length == 0) {
//            return 0;
//        }
//        List<Integer> tsList = Arrays.stream(ts).boxed().collect(Collectors.toList());
//        if (tsList.contains(0)) {
//            return 0;
//        }
        int closestIndex = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < ts.length; ++i) {
            int abs = Math.abs(ts[i]);
            if (abs < diff) {
                closestIndex = i;
                diff = abs;
            } else if (abs == diff && ts[i] > 0 && ts[closestIndex] < 0) {
                //same distance to zero but positive
                closestIndex =i;
            }
        }
        System.out.println(ts[closestIndex ]);
    }

    static boolean exists(int[] ints, int k) {
        return Arrays.stream(ints).anyMatch(number -> number == k);
    }
}
