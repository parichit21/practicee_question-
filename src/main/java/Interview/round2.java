package Interview;

public class round2 {
    /*remove the duplicaate  from an array */

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3};
        duplicate(arr);
    }

    static void duplicate(int [] arr ){

        for (int i = 0; i < arr.length; i++) {
                      boolean isduplicate = false;
            for (int j = 0; j < i; j++) {
                        if (arr[i] == arr[j]){
                            isduplicate = true;
                            break;
                        }
            }
            if(!isduplicate){
                System.out.print(arr[i]);
            }
        }




    }



}
