// 1833. Maximum Ice Cream Bars
class Solution {
public int maxIceCream(int[] costs, int coins) {
        int max = Integer.MIN_VALUE;
        
        for(int num : costs){
            max = Math.max(max,num);
        }
        
        int [] arr = new int[max+1];
        for(int num : costs)
            arr[num]++;
        int k =0;
        int sum = 0,cnt = 0;
        for(int i =0 ;i<arr.length;i++){
            while(arr[i]-- >0){
                sum += i;
                if(sum<=coins)
                    cnt++;
                else
                    break;
            }
            if(sum > coins)
                break;
        }
       
        return cnt;
    }
}