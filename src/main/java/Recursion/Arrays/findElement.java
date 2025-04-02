package Recursion.Arrays;

public class findElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,78,9,9,32};
      boolean ans1 =  element(arr,4,0);
      System.out.println(ans1);
       int ans =  elementindex(arr,4,0);
       System.out.println(ans);
     int revindex = elementindexfromLast(arr,4,arr.length-1);
     System.out.println(revindex);
    }
    static boolean element(int [] arr, int target,int index){
            if(index ==arr.length)
            {
                return false;
            }
            return arr[index] ==target || element(arr,target,index+1);
    }

    /*to find the index*/
    static int elementindex(int [] arr, int target,int index){
        if(index ==arr.length)
        {
            return -1;
        }

        if(arr[index] ==target)
        {
            return index;
        }
        else {
            return elementindex(arr,target,index+1);
        }
    }

    /*From last*/
    static int elementindexfromLast(int [] arr, int target,int index){
        if(index ==-1)
        {
            return -1;
        }

        if(arr[index] == target)
        {
            return index;
        }
        else {
            return elementindexfromLast(arr,target,index-1);
        }
    }
}
