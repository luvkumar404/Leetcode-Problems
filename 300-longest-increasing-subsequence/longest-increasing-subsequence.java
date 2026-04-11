class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int cnt=0;
        Arrays.fill(dp, 1);

        if(n==0) return 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]) {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            cnt=Math.max(cnt, dp[i]);
        }
        return cnt;
    }
}