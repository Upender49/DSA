// Cut rope to maximise product

class Solution {
    public int maxProduct(int n) {
        // code here
       // int half = n / 2;
       int [] dp = new int[n+1];
       Arrays.fill(dp,-1);
        int max = Integer.MIN_VALUE;
        for(int i = 1;i<=n/2;i++){
            int left = solve(i,dp);
            int right = solve(n-i,dp);
           max = Math.max(max,left * right);
        }
        return max;
    }
    public static int solve(int n,int [] dp){
        if(n <= 1)
            return 1;
        int max = Integer.MIN_VALUE;
        if(dp[n]!=-1)
            return dp[n];
        for(int i = 1;i<=n/2;i++){
            int left = solve(i,dp);
            int right = solve(n-i,dp);
            max = Math.max(max,left * right);
        }
        dp[n] = Math.max(n,max);
        return dp[n];
    }
}
