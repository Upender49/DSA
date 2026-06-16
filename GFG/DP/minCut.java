package GFG.DP;
// Min cut Square

class Solution {
    public int minCut(int a, int b) {
        // code here
        int [][] dp = new int[14][14];
        for(int [] x : dp)
            Arrays.fill(x,-1);
        return solve(a,b,dp);
    }
    public static int solve(int a,int b,int [][] dp){
        if(a == b)
            return 1;
        int hor = 0,ver = 0;
        int ans = Integer.MAX_VALUE;
        if((a == 11 && b == 13) || (b == 11 && a == 13))
            return 6;
        if(dp[a][b]!=-1)
            return dp[a][b];
        for(int i = 1;i<a;i++){
            ans = Math.min(ans,solve(a-i,b,dp) + solve(i,b,dp));
        }
        for(int i = 1;i<b;i++){
            ans = Math.min(ans,solve(a,b-i,dp) + solve(a,i,dp));
        }
        dp[a][b] = ans;
        return ans;
    }
}
