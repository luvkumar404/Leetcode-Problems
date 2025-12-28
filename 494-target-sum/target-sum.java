class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int totSum=0;
        for(int num:nums) totSum+=num;

        if(Math.abs(target)>totSum) return 0;
        if((totSum+target)%2 != 0) return 0;

        int sum=(totSum+target)/2;

        int dp[][]=new int[n+1][sum+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            int v=nums[i-1];
            for(int j=0;j<=sum;j++){
                dp[i][j]=dp[i-1][j];
                if(v<=j) {
                    dp[i][j]+=dp[i-1][j-v];
                }
            }
        }
        return dp[n][sum];
    }
}