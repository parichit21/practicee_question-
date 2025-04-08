package Assignments.Arrays;

import java.util.Arrays;

public class Flipping_an_Image_832 {
    /*
    Example 1:

    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    Output: [[1,0,0],[0,1,0],[1,1,1]]
    Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]*/
    public static void main(String[] args) {
       int [][] image = {{1,1,0},{1,0,1},{0,0,0}};
       System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = image[i].length - 1;

            while (start <= end) {
                // Swap and Invert
                int temp = image[i][start] ^ 1;
                image[i][start] = image[i][end] ^ 1;
                image[i][end] = temp;
                start++;
                end--;
            }
        }
        return image;
    }
}
