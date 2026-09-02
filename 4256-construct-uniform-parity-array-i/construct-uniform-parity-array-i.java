class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        if(n == 1)
            return true;
        int even = 0, odd = 0;
        for(int ele : nums1){
            if(ele%2 == 0)
                even++;
            else
                odd++;
        }
        if(even == n || odd == n)
            return true;
        if(even == 0 && odd != 0)
            return false;
        return true;
    }
}