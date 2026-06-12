// Check Repeated Substring with K Replacements

class Solution {
    public boolean kSubstr(String s, int k) {
        // code here
        int n = s.length();
        if(n<=k)    return true;
        Map<String,Integer> mp = new HashMap<>();
        for(int i  = 0;i+k<=n;i+=k){
            String str = s.substring(i,i+k);
            mp.put(str,mp.getOrDefault(str,0)+1);
        }
        int max= 0,sum=0;
        for(Map.Entry<String,Integer> es : mp.entrySet()){
            max = Math.max(max,es.getValue());
            sum+= es.getValue();
        }
        return (mp.size() == 1 || sum - max == 1);
    }
}
