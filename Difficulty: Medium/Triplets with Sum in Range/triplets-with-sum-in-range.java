class Solution {
	
	public int countTriplets(int[] arr, int l, int r) {
		// code here
		Arrays.sort(arr);
		return solve(arr, r) - solve(arr, l - 1);
		
	}
	public static int solve(int [] arr, int tar) {
		int cnt = 0, n = arr.length;
		for (int i = 0; i< n - 2; i++) {
			int left = i + 1, right = n - 1;
			while (left < right) {
				int sum = arr[i] + arr[left] + arr[right];
				if (sum <= tar) {
					cnt += right - left;
					left++;
				}
				else
					right--;
			}
		}
		return cnt;
	}
}
