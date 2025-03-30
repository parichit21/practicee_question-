package Recursion;

public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {-18,-12,-10,3,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int result = binarySearchRecursion(arr,target, 0,arr.length-1);
        System.out.println(result);
    }

    static int binarySearchRecursion(int [] arr, int target, int start,int end ){

          if(start > end)
          {
              return -1;
          }
            int mid = start+ (end -start)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            if(target < arr[mid])
            {
             return    binarySearchRecursion( arr, target, start, mid-1 );
            }
             return binarySearchRecursion( arr, target, mid+1, end );
           }

    static int binarySearch(int [] arr, int target){
            int start = 0;
            int end = arr.length-1;
            while (start<=end)
            {
                int mid = start + (end-start)/2 ;
                if(target< arr[mid])
                {
                    end = mid-1;
                }
                else if(target>arr[mid])
                {
//                ans is in 2nd half
                    start = mid+1;
                } else {
//                ans is in mid
                    return mid;
                }
            }
        return -1;
    }
}
