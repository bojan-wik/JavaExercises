package various.visaRozmowaTech;

public class Solution {

    public static void main(String[] args) {

        // true
        System.out.println(solution(new int[] {1, 1, 2, 3, 3}, 3));
        // false
        System.out.println(solution(new int[] {1, 1, 3}, 3));
        // true
        System.out.println(solution(new int[] {1, 2, 3, 3}, 3));
        // false
        System.out.println(solution(new int[] {2, 3, 4, 4}, 3));
         // true
        System.out.println(solution(new int[]{1, 2}, 2));
        // false
        System.out.println(solution(new int[]{1, 1}, 2));
    }

    public static boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 || A[n - 1] != K)
            return false;
        else
            return true;
    }
}
