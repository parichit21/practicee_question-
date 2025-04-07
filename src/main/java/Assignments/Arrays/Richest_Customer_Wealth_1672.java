package Assignments.Arrays;

public class Richest_Customer_Wealth_1672 {
    /*
    Input: accounts = [[1,2,3],[3,2,1]]
    [1,5],[7,3],[3,5]
    Output: 6
    Explanation:
    1st customer has wealth = 1 + 2 + 3 = 6
    2nd customer has wealth = 3 + 2 + 1 = 6
    Both customers are considered the richest with a wealth of 6 each, so return 6.*/
    public static void main(String[] args) {
        int[][] nums ={{1,2,3},{3,2,1}};
        int ans =  maximumWealth(nums);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {
        int returnsum =0;
        for (int i = 0; i <accounts.length ; i++) {
            int sum =0;
            for (int j = 0; j < accounts[i].length; j++) {
                    sum+= accounts[i][j];}
            if (returnsum<=sum)
            {returnsum= sum;}
        }
        return returnsum;
    }
}
