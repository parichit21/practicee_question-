package Assignments.Arrays;

public class Sum_of_Array_Elements {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
            System.out.println(sum(arr));

    }
    static int sum(int [] arr){
     int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        return ans;
    }
}
