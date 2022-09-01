package edabit.arrayOfMultiples;

public class Program {

    public static int[] arrayOfMultiples(int num, int length) {
        int[] multiplesOfNum = new int[length];
        multiplesOfNum[0] = num;
        for (int i = 1; i < multiplesOfNum.length; i ++) {
            multiplesOfNum[i] = multiplesOfNum[i - 1] + num;
        }
        return multiplesOfNum;
    }
}
