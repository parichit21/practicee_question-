package Assignments.Arrays;

public class Cells_with_Odd_Values_in_a_Matrix_1252 {
    /*
    Input: m = 2, n = 3, indices = [[0,1],[1,1]]
    Output: 6
    Explanation: Initial matrix = [[0,0,0],[0,0,0]].
    After applying first increment it becomes [[1,2,1],[0,1,0]].
    The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
*/
    public static void main(String[] args) {
        int [] [] indices = {{0,1},{1,1}};
        int ans = oddCells(2,3,indices);
        System.out.println(ans
        );
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];

        // Normal for loop to increment row and column counts
        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];
            row[r]++;
            col[c]++;
        }
        int count = 0;

        // Check each cell for odd values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 == 1) {
                    count++;
                }
            }
        }
        return count;

    }









}
