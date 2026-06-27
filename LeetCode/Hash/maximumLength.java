package LeetCode.Hash;
// 3020. Find the Maximum Number of Elements in Subset
class Solution {
    public int maximumLength(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
                mp.put(num,mp.getOrDefault(num,0)+1);
        }
        System.out.println(mp);
        int max = 0;
        for(Map.Entry<Integer,Integer>  es : mp.entrySet()){
            max = Math.max(max,solve(es.getKey(),mp));
        }
        return max; 
    }
    public static int solve(int ele ,Map<Integer,Integer> mp){
        if(ele == 1){
            int val =  mp.get(ele);
            if(val%2 == 0)
                return val -1;
            return val;
        }
        int cnt = 0;
        if(mp.containsKey(ele) && mp.get(ele) > 1){
          //  System.out.println("in loop"+next);
           cnt = 2 + solve(ele*ele,mp);
        }
        else if(mp.containsKey(ele) && mp.get(ele) == 1){
            cnt += 1;
        }
       
        if(cnt%2 == 0)
            return cnt -1;
       // System.out.println(ele+" "+prev +" "+cnt);
        return cnt;
    }
}
