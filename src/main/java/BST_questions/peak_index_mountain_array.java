package BST_questions;

public class peak_index_mountain_array {

//    mountain ayyay = forst increase and then decrese
    public static void main(String[] args) {
//        Input: arr = [0,1,0]
//        Output: 1
        int[] arr = {0,1,0};

    }

    public int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end = arr.length;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                /*you are in the dec part of the array
                * this may be the ans , but look at left
                * this is why end is not mid-1*/
                end = mid;
            }else {
                /*you are in asc part of array*/
                start=mid+1;
            }




        }


         return -1;
    }
}
