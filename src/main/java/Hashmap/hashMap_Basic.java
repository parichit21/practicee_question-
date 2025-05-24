package Hashmap;

import java.util.HashMap;

public class hashMap_Basic {

    public static void main(String[] args) {
        int [] arr = {8,7,3,1,2,4,6,9,12,34,21,54,33};
        int num = 34;
        searchnumber(arr,num);
    }
    static void searchnumber(int []arr,int  num){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
            if(map.containsKey(num)){
                System.out.println("found at index "+ map.get(num));
            }
            else System.out.println(num +"not found");
    }
}
