package ca.ciccc.wmad.assignment8.problem4;
import java.util.Arrays;

public class problem4 {
    static class Solution {
        public static int[] slution(int[] A, int K) {
            for(int i = 0; i < K; i++){

                int last = A[A.length-1];

                for(int j= A.length-1; j > 0; j--){

                    A[j] = A[j-1];
                }
                A[0] = last;
            }
            return A;
        }
    }
    public static void main(String[] args) {
        int[] A= {3, 8, 9, 7, 6};
        int K 4;

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(Solution.solution(A,K)));
    }
}
