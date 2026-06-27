// Ways to Tile the Floor

class Solution {
    static int mod = (int)(1e9+7);
	public int countWays(int n, int m) {
		// code here
		int [] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		return solve(n, m, dp);
	}
	public static int solve(int n, int m, int [] dp) {
		if (n == 0)
			return 1;
		if (n < 0)
			return 0;
		if (dp[n] != -1)
			return dp[n];
		int ans = 0;
		
		ans += solve(n - 1, m, dp);
		ans += solve(n - m, m, dp);
		dp[n] = ans% mod;
		return dp[n];
	}
}

