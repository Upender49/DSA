// 1846. Maximum Element After Decreasing and Rearranging
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        int ans = 1;
        Arrays.sort(arr);
        if(arr[0] != 1)
            arr[0] = 1;
        for(int i = 1;i<n;i++){
            if(Math.abs(arr[i-1] - arr[i]) > 1)
                arr[i] = arr[i-1] + 1;
            ans = Math.max(ans,arr[i]);
        }
        return ans;
    }
}