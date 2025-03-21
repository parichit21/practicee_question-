package BST_questions;

public class peak_index_mountain_array {

//    mountain ayyay = forst increase and then decrese
    public static void main(String[] args) {
//        Input: arr = [0,1,0]
//        Output: 1
        int[] arr = {0,1,0};
       int ans =  peakIndexInMountainArray(arr);
       System.out.println(ans);
    }

    static int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end = arr.length-1;
        while(start<end)
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
                start=mid+1;   //because we know that mid+1 element > mid element
            }
        }
/*             in the end , start == end pointing to the largest number because of the 2 checks above
*               sttart and the end are always trying to find the max element in the above 2 checks
*               hence when they are pointing to just one element that is the max one element
*                more elaboration : at every point for start and end, they have the best possible answer till that time
*               and if we are saving one item is remaining hence because of the above checks    */


         return start;
    }
}
