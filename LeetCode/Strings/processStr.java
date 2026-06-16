package Strings;


// 3612. Process String with Special Operations I
class Solution {
    public String processStr(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<n;i++){
            char ch  = s.charAt(i);
            if(Character.isLowerCase(ch)){
                ans.append(ch);
            }
            else if(ch =='*'){
                if(ans.length() > 0){
                    ans.deleteCharAt(ans.length() - 1);
                }
            }
            else if(ch=='#'){
                ans.append(ans.toString());
            }
            else if(ch=='%'){
                ans.reverse();
            }
        }
        return ans.toString();
    }
}
