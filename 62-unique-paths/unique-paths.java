class Solution {
    public int go(int i,int j,int m,int n,int[][] dp){
        if(i  == 0 && j == 0){
                return 0;
        }

        int up = 0;
        int left = 0;

        if(i<0){
           return 0;
        }
        if(j<0){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        up =  go(i-1,j,m,n,dp);
        left =  go(i,j - 1,m,n,dp);
        if(up == 0 && left == 0){
            return 1;
        }
        dp[i][j]=up+left;
        return dp[i][j];
        
        
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        if(m==1 && n==1){
            return 1;
        }
        for(int i = 0;i < m;i++){
            Arrays.fill(dp[i],-1);
        }
        
        int count = go(m-1,n-1,m,n,dp);
        return count;
    }
}