// Equalize All Prefix Sums

class Solution {
    public ArrayList<Integer> optimalArray(int[] arr) {
        // code here
        int n = arr.length,prev = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int mid = i/2;
            if(prev == -1){
                ans.add(mid);
                prev = mid;
            }
            else{
                ans.add(Math.abs(arr[i] - arr[mid]) + prev);
                prev = ans.get(i);
                
            }
            
        }
        return ans;
    }
}
