package Prefix-sum;
// 1732. Find the Highest Altitude
class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0,sum=0;
        for(int ele : gain){
            sum+=ele;
            max = Math.max(max,sum);
        }
        return max;
    }
}
