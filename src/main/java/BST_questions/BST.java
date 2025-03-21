package BST_questions;

public class BST {
    public static void main(String[] args) {
    int [] arr = {-18,-12,-10,3,0,2,3,4,15,16,18,22,45,89};
    int target = 22;

    int  search = binarysearch(arr, target);
    System.out.println(search);
    }

    static int binarysearch(int[] arr, int target){

        int start =0;
        int end = arr.length-1;

        while(start <= end)
        {
//            find the middle element
            int mid = start + (end-start) /2;
            if(target <arr[mid]){
                //                ans is in 1st half
                end = mid-1;

            }else if(target>arr[mid])
            {
//                ans is in 2nd half
                start = mid+1;
            }else {
//                ans is in mid
                return mid;
            }
        }
        return -1;
    }
}
