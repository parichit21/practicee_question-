package Recursion.Arrays;

import java.util.ArrayList;

public class findAlltargetElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
    //   allElements(arr,4,0,list);
   //     System.out.println(list);

     ArrayList list1 =    findAllIndex(arr,4,0);
        System.out.println(list1);
    }
    static ArrayList list =  new ArrayList();
    static int allElements(int [] arr , int target ,int index, ArrayList list ){
        if(index == arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return allElements(arr,target,index+1,list);
    }


//    getting arraylist or argument inside the function ie not creating
//    healper function

    static ArrayList<Integer> findAllIndex(int [] arr ,int target , int index){
        ArrayList list1 = new ArrayList();
        if(index == arr.length)
        {
            return list1;
        }
//        this will contins all the ans
        if(arr[index]==target)
        {
            list1.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr,target,index+1);

        list1.addAll(ansFromBelowCalls);
        return list1;
    }


}
