package BST_questions;

/*1095. Find in Mountain Array*/
public class find_in_mountaining_array {
    /*Input: mountainArr = [1,2,3,4,5,3,1], target = 3
     Output: 2*/
    public static void main(String[] args) {

        int []mountainArr  = {1,2,3,4,5,3,1};
        int target = 2;
            int ans = search(mountainArr,target);
            System.out.println(ans);

    }
    static int search(int[] arr, int target){

        int peak = peakIndexInMountainArray(arr);
        int firsttry = orderAgnostic(arr, target,0,peak);
        if(firsttry != -1)
        {return firsttry;}
        return orderAgnostic(arr,target,peak+1,arr.length-1) ;
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
    static int orderAgnostic(int[] arr, int target, int start ,int end){
        boolean isAsc = arr[start] < arr[end];

        while(start <= end)
        {
//            find the middle element
            int mid = start + (end-start) /2;
            if(arr[mid] == target){
                //                ans is in 1st half
                return mid;

            }
            if(isAsc)
            {
          if(target<arr[mid])
          {
              end = mid-1;
          }else{
             start = mid+1;
          }
          }else {
                if(target> arr[mid]){
                    end = mid-1;
                }else {start = mid+1;}
            }
        }
        return -1;
    }

}
