package LTquestions_arrays;

import java.util.Arrays;

//perform Xor here /*
// every thing whis is XOR by 1 result in apposite of that number*/
public class flipingImage {
    /*
    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    Output: [[1,0,0],[0,1,0],[1,1,1]]
    Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
    */
    public static void main(String[] args) {
    int [][] arr = {{1,1,0},{1,0,1},{0,0,0}};
      int[][] ans = flipAndInvertImage(arr);
      System.out.println(Arrays.toString(ans));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for (int j = 0; j < image.length; j++)
      {
          int[] row = image[j];
          for(int i =0;i<(image[0].length+1)/2;i++)
          {
              int temp = row[i] ^1;
              row[i] = row[image[0].length-i-1]^1;
              row[image[0].length-i-1] =temp;
          }
      }
      return image;
    }

}
