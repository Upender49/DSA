package GFG.Matrix;
// Exit Point in a Matrix

class Solution {
	public List<Integer> exitPoint(int[][] mat) {
		// code here
		int n = mat.length;
		int m = mat[0].length;
		int i = 0, j = 0;
		int k = 1;
		int ansi = -1, ansj = -1;
		while (i >= 0 && i <= n - 1 && j >= 0 && j <= m - 1) {
			ansi = i;
			ansj = j;
			if (mat[i][j] == 0) {
				
				if ((k == 1)) {
					j++;
				}
				if ((k == 3)) {
					j--;
				}
				if ((k == 2)) {
					i++;
				}
				if ((k == 4)) {
					i--;
				}
			}
			else {
				
				if (mat[i][j] == 1) {
					k++;
					if(k == 5)
					    k = 1;
					else
					k = k % 5;
					mat[i][j] = 0;
					if (k == 1) {
						j++;
					}
					if (k == 2) {
						i++;
					}
					if (k == 3) {
						j--;
					}
					if (k == 4) {
						i--;
					}
				}
			}
		}
		List<Integer> ans = new ArrayList<>();
		ans.add(ansi);
		ans.add(ansj);
		return ans;
	}
}

