package BST_questions;

public class find_number_infinite_arr {
//    find position of an element in a sorted array of infinite number
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int target=10;
    System.out.println(ans(arr,target));
}

static int position (int[] arr ,int target, int start, int end){
    while (start<=end)
    {
        int mid = start + (end-start)/2;
            if(target<arr[mid])
            {
                end = mid-1;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else return mid;
    }
    return -1;
}

//finding range first and last
    static int ans(int[] arr,int target)
    {
//        first find the range
//        first start with a box od size 2;
        int start = 0;
        int end = 1;
//         condition for the target to  lie in the range
        while(target > arr[end])
        {
            int newStart = end+1;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return  position(arr,target,start,end);
    }




}
