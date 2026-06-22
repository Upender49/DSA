package GFG.Pointers;
// Maximum Area Between Bars
class Solution {
    public int maxArea(List<Integer> height) {
        // code here
        int n = height.size();
        int left = 0,right = n-1,max = Integer.MIN_VALUE;
        while(left < right){
            int sum = Math.min(height.get(left),height.get(right))*(right - left -1);
            if(height.get(left) < height.get(right)){
                left++;
            }
            else
                right--;
            max = Math.max(max,sum);
        }
        return max;
    }
}
