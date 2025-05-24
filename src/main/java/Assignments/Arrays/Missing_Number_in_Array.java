package Assignments.Arrays;

public class Missing_Number_in_Array {

public static void main(String[] args) {
    int [] arr= {1,2,3,4,6};
//    output = 3
   System.out.println(missing_number(arr));
}
static int missing_number(int []arr){
    int ans =0;
    for(int i = 0; i <arr.length ; i++) {
                  if(i+1!=arr[i])
                  {
                      ans = i+1;
                      return ans;
                  }

    }
    return ans;
}
}
