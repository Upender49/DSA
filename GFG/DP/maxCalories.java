// Maximum calorie


class Solution {
    public int maxCalories(int arr[], int n) {
        // Your code goes here
        
        int [][][] dp = new int[n+1][3][3];
        for(int [][] u : dp){
            for(int [] x : u)
                Arrays.fill(x,-1);
        }
        return solve(arr,n,0,0,0,dp);
    }
    public static int solve(int [] arr,int n,int idx,int first,int sec,int [][][] dp){
        if(idx == n)    return 0;
        int take = 0,nottake;
        if(dp[idx][first][sec]!=-1)
            return dp[idx][first][sec];
        if(first == 0 && sec == 0){
            take = arr[idx] + solve(arr,n,idx+1,1,0,dp);
        }
        if(first == 1 && sec == 0){
            take = arr[idx] + solve(arr,n,idx+1,1,1,dp);
        }
        if(first == 1 && sec == 1){
            take = solve(arr,n,idx+1,0,0,dp);
        }
    
            nottake = solve(arr,n,idx+1,0,0,dp);
        dp[idx][first][sec] =  Math.max(take,nottake);
        return dp[idx][first][sec];
    }
}
