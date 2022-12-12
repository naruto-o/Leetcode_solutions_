https://leetcode.com/problems/climbing-stairs/
class Solution {
    public int climbStairs(int n) {
        int []dp = new int[n+1];
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        dp[0] =0;  
        dp[1] =1;
        dp[2] =2;
        for(int i = 3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }        
}
public class ClimbingStairs_Iterative {

    public int climbStairs(int n) {

        // Return the ways for n == 1 and n == 2, since we know the result already.
        if (n == 1 || n == 2) return n;

        // When using tabulation, seed the table with the base cases for n == 1 and n == 2.
        // Since the array in Java is zero-indexed, we make sure to have the table of size "n + 1"
        // as we need to access index 'n'.
        int[] table = new int[n + 1];
        table[1] = 1;
        table[2] = 2;
        // Iterate through the table and update its values until 'n'.
        for (int i = 3; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }

        // table[n] is the result.
        return table[n];
    }
}
