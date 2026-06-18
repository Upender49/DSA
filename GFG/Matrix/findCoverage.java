package GFG.Matrix;
// Coverage of all Zeros in a Binary Matrix
class Solution {
    public int findCoverage(int[][] mat) {
        // code here
        int m = mat.length;
        int n = mat[0].length;
        int cnt = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(mat[i][j] == 0){
                   cnt+= row(mat,n,i,j) + col(mat,m,i,j);
                  //  System.out.print(cnt+" ");
                }
            }
        }
        return cnt;
    }

    public static int row(int [][] mat,int size,int i,int idx){
        int cnt = 0;
        int j = idx;
        while(j >=0){
            if((mat[i][j]) == 1){
                cnt++;
                break;
            }
            j--;
        }
        j = idx;
        while(j < size){
            if((mat[i][j]) == 1){
                cnt++; 
                break;
            }
            j++;
        }
        return cnt;
    }
    public static int col(int [][] mat,int size,int idx,int j){
        int cnt = 0;
        int i = idx;
        while(i >=0){
            if((mat[i][j]) == 1){
                cnt++;
                break;
            }
            i--;
        }
        i = idx;
        while(i < size){
            if((mat[i][j]) == 1){
                cnt++;
                break;
            }
            i++;
        }
        return cnt;
    }
}
