package Pattern_Questions;

public class patternQuestions {
    /*Tips and trik
    1. run the for loops == number of rows
    2. identify for each row number, how many column are there and the type of elements
    3. what do you need to print
    */
    public static void main(String[] args) {
       int n =5;
//        pattern1(n);
//       pattern2(n);
//        pattern3(n);
      //  pattern4(n);
//        pattern5(n);
     //   pattern6(n);
        //pattern28(n);
       // pattern8(n);
      //  pattern7(n);
//        pattern30(n);
        pattern31(n);
    }
    static void pattern31(int n) {
    /*
         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
     */
//    spaces = number of rows - column
        n=2*n;
      for(int row =1;row<n;row++)
      {
          for(int column =1;column<n;column++)
          {
//              for every pattern question we need to figure
//              out the pattern that need should be present
              int atEveryIndex = Math.min(Math.min(row,column), Math.min(n-row,n-column));
              System.out.print(atEveryIndex + " ");
          }
          System.out.println();
      }



    }
    static void pattern30(int n) {
    /*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
     */
//    spaces = number of rows - column
    for (int row = 1; row < n; row++) {

        for (int space = 0; space < n-row; space++) {
            System.out.print("  ");
        }
        for (int column = row; column >=1; column--) {
            System.out.print(column+" ");

        }
        for (int column = 2; column <= row; column++) {
            System.out.print(column+" ");

        }
        System.out.println();

    }

}
    static void pattern7(int n){
        /*
        *****
         ****
          ***
           **
            *
         */
        for (int row = 0; row < n; row++) {
            int totalcolsinRow = row;
            int numberOfSpacs = n-totalcolsinRow;
            for (int i = 0; i < numberOfSpacs; i++) {
                System.out.print(" ");
            }
            for (int column = numberOfSpacs; column > totalcolsinRow; column--) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
    static void pattern8(int n){
        /*
         *
        * *
       * * *
      * * * *
     * * * * *
         */
        for (int row = 0; row < n; row++) {
            int totalcolsinRow = row > n ? n - row : row;
            int numberOfSpacs = n-totalcolsinRow;
            for (int i = 0; i < numberOfSpacs; i++) {
                System.out.print(" ");
            }
            for (int column = 0; column < totalcolsinRow; column++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static void pattern28(int n){
        /*
         *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
         */

        for (int row = 0; row <2*n ; row++) {
            int totalcolsinRow = row > n ? 2 * n - row : row;
            int numberOfSpacs = n-totalcolsinRow;
            for (int s = 0; s < numberOfSpacs; s++) {
                System.out.print("");
            }
            for (int column = 0; column < totalcolsinRow; column++) {
                          System.out.print("* ");

            }
            System.out.println();

        }



    }

    static void pattern6(int n){
        /*
              *
             **
            ***
           ****
          *****
         */
        for (int row = 0; row < n; row++) {
            int totalcolsinRow = row > n ? n - row : row;
            int numberOfSpacs = n-totalcolsinRow;
            for (int i = 0; i < numberOfSpacs; i++) {
                System.out.print(" ");
            }
            for (int column = 0; column < totalcolsinRow; column++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
    static void pattern5(int n){
        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         */
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < row; column++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int row = n; row > 0; row--) {
            for (int column = 0; column < row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern4(int n){
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        for (int row = 0; row <=n ; row++) {
//                for every row run the column
            for (int column = 1; column <=row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }

    }
    static void pattern1(int n){
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for (int row = 0; row <n ; row++) {
//                for every row run the column
            for (int column = 0; column < n; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern2(int n){
        /*
          *
          **
          ***
          ****
          *****
         */
        for (int row = 0; row <n ; row++) {
//                for every row run the column
            for (int column = 0; column < row; column++) {
                        System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern3(int n){
        /*
        *****
        ****
        ***
        **
        *
         */
        for (int row = n; row >0 ; row--) {
//                for every row run the column
            for (int column = 0; column <row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }



















































}
