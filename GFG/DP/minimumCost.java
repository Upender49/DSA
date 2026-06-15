package GFG.DP;
// Minimum cost to fill given weight in a bag
class Solution {
	public int minimumCost(int[] cost, int w) {
		// code here
		int n = cost.length;
		int [][] dp = new int[w + 1][n + 1];
		for (int x[] : dp)
			Arrays.fill(x, -1);
		int ans = solve(cost, w, n, 0, dp);
		if (ans == Integer.MAX_VALUE)
			return - 1;
		return ans;
	}
	public static int solve(int [] cost, int w, int n, int i, int [][] dp) {
		if (w == 0)
			return 0;
		if (i == n || w < 0)
			return Integer.MAX_VALUE;
		if (dp[w][i] != -1)
			return dp[w][i];
		int take = Integer.MAX_VALUE, skip = Integer.MAX_VALUE;
		if (cost[i] != -1) {
			int temp = solve(cost, w - (i + 1), n, i, dp);
			if (temp != Integer.MAX_VALUE)
				take = cost[i] + temp;
			
		}
		skip = solve(cost, w, n, i + 1, dp);
		dp[w][i] = Math.min(take, skip);
		return dp[w][i];
	}
}
