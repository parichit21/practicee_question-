package DSA;

import java.util.ArrayList;
import java.util.Scanner;


public class Arraylist<I extends Number> {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//     single arraylist
   //     ArrayList<Integer> arr= new ArrayList<>(3);
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);

//        2d arraylist
        ArrayList<Arraylist<Integer>> arr = new ArrayList<>();

//        initialized
        for(int i=0;i<3;i++)
        {
            arr.add(new Arraylist<>());
        }
        System.out.println();


        //    aad element 
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr.get(i).add(scan.nextInt());
            }
        }
    }

    private void add(I i) {
    }


}
