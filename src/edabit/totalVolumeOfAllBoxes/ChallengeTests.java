package edabit.totalVolumeOfAllBoxes;

public class ChallengeTests {

    public static void main(String[] args) {

        System.out.println(totalVolume(new int[][]{{2, 4, 6}, {1, 3, 5}}));
        System.out.println(totalVolume(new int[][] {{2, 3, 2}, {6, 6, 7}, {1, 2, 1}}));
    }

    public static int totalVolume(int[][] array) {
        if (array.length == 0) {
            return -1;
        }

        int total = 0;
        for (int i = 0; i < array.length; i ++) {
            int product = 0;
            for (int j = 0; j < array[i].length; j ++) {
                if (j != 0) {
                    product *= array[i][j];
                } else {
                    product = array[i][j];
                }
            }
            total += product;
        }

        return total;
    }
}
