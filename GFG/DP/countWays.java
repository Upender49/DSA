// Count Matching Subsequences


class Solution {
    static int mod = (int)(1e9+7);
    public static int countWays(String s1, String s2) {
        // code here
        int [][] dp = new int[s1.length()+1][s2.length()+1];
        for(int [] x : dp)
            Arrays.fill(x,-1);
        return solve(s1,s2,s1.length(),s2.length(),0,0,dp);
    }
    public static int solve(String s1,String s2, int n,int m,int i,int j,int [][] dp){
        if(j == m)  return 1;
        if(i == n){
            return 0;
        } 
        if(dp[i][j]!=-1)
            return dp[i][j];
        int take = 0, nottake = 0;
        if(s1.charAt(i) == s2.charAt(j)){
           // System.out.print(s1.charAt(i));
            take = solve(s1,s2,n,m,i+1,j+1,dp);
        }
        nottake = solve(s1,s2,n,m,i+1,j,dp);
        dp[i][j] = (take + nottake)%mod;
        return dp[i][j];
    }
}
