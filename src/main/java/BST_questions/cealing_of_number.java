package BST_questions;

public class cealing_of_number {
//    find the ceiling number
  //  ceiling  = smallest element in array greater or = target
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
      //      int ans = cealing(arr, target);
      //      System.out.println(ans+" element " +"="+arr[ans]);
        int [] brr = {2,3,5,9,14,16,18};
        int answer =  floor(brr,target);
        System.out.println(answer+" element " +"="+arr[answer]);

    }
    static int cealing(int[] arr, int target){
     int start = 0;
     int end = arr.length;
   //  int position=0;
     int mid;
     while (start<=end)
     {
         mid = start + (end-start) /2;
         if(target <arr[mid]){
             end = mid-1;
         }else if(target>arr[mid])
         {
             start = mid+1;
         }else {

             return mid;
         }
     }
        return  start;
    }

//    find the floor of a number
//    floor = grater numbr smaller or = target
  static int floor(int[] brr, int target){
      int start=0;
      int end = brr.length;
      while(start <= end)
      {
          int mid = start+ (end-start)/2;
          if(target<brr[mid])
          {
              end = mid-1;
          }else if(target>brr[mid]){
              start = mid+1;
          }
          else return mid;
      }

        return end;
  }



}
