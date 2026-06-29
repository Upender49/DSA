package GFG.DP;

class Solution {
    public int maxDotProduct(int[] a, int[] b) {
        // code here
        int [][] dp = new int [a.length+1][b.length+1];
        for(int [] x : dp)
            Arrays.fill(x,-1);
        return solve(a,b,0,0,0,dp);
    }
    public static int solve(int [] a, int [] b, int i,int j,int sum,int [][] dp){
        if(i == a.length)
            return sum;
        if(i > a.length || j > b.length)
            return 0;
        int take = 0,nottake = 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(j < b.length)
            take = (a[i] * b[j]) + solve(a,b,i+1,j+1,sum,dp);
        if(j - b.length > i - a.length)
            nottake = solve(a,b,i+1,j,sum,dp);
        dp[i][j] = Math.max(take,nottake);
        return dp[i][j];
    }
}
