package BST_questions;


//find the smallest letter Greater than target
public class smallestLetter_greater_target {
    public static void main(String[] args) {

        char[] letters = {'c','f','j'};
        char target = 'l';
        char element = smallest(letters, target);
        System.out.println(element);
    }
       static char smallest(char[] letters, char target){

        int start= 0;
        int end = letters.length-1;
        while (start<=end)
        {
            int mid = start +(end-start)/2;
            if(target<letters[mid])
            {
                end = mid-1;
            }
            else start=mid+1;
        }
        return letters[start % letters.length];
       }


}
