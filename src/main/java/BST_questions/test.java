package BST_questions;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,7,8,9,3,3,2,2,1,0};
                int ans = max_value(arr);
                System.out.println(ans);
    }
    static int max_value(int[] arr){
       int start  = 0;
       int end = arr.length-1;

       while (start<end)
       {
           int mid = start+ (end-start)/2;
           if(arr[mid]>=arr[mid+1])
           {
               end = mid;
           }else {

               start=mid+1;   //because we know that mid+1 element > mid element
           }
       }
        return end;
    }
}
