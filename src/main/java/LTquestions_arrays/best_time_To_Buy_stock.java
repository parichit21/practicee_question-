package LTquestions_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class best_time_To_Buy_stock {
    /*
    Input: prices = [7,1,5,3,6 ,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*/
    public static void main(String[] args) {
        int [] price ={1,2};
        int ans = maxProfit(price);
        System.out.println(ans);
    }

    static int maxProfit(int[] prices) {
int minPrice = Integer.MAX_VALUE;
int maxProfit = 0;

for(int i =0;i<prices.length;i++)
{
    if(prices[i]< minPrice){
        minPrice = prices[i];
    }else{if(prices[i] -minPrice>=maxProfit)
            maxProfit = prices[i]-minPrice;
    }
}
        return maxProfit;
}}
