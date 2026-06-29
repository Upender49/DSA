package GFG.DP;

class Solution {
    static int mod = (int)(1e9 + 7);
	public int countStrings(int n, int k) {
		// code here
		int [][][] dp = new int[n+1][n+1][2];
		for(int [][] x : dp)
		    for(int [] u : x)
		        Arrays.fill(u,-1);
		return solve(n, k, 0, 0, false,dp);
		
	}
	public static int solve(int n, int k, int i, int count, boolean last,int [][][]dp) {
		if (i == n) {
			if (count == k)
				return 1;
			return 0;
		}
		int take = 0, nottake = 0;
		int idx = last ? 1 : 0;
		if(dp[i][count][idx]!=-1)
		    return dp[i][count][idx];
		if (i == 0) {
			take = solve(n, k, i + 1, count, true,dp);
			nottake = solve(n, k, i + 1, count, false,dp);
		}
		else {
			if (last)
				take = solve(n, k, i + 1, count + 1, last,dp);
			else
				take = solve(n, k, i + 1, count, true,dp);
			nottake = solve(n, k, i + 1, count, false,dp);
		}
		dp[i][count][idx] = (take + nottake)%mod;
		return dp[i][count][idx];
	}
}

