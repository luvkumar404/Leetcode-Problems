class Solution {
    int memo[];
    public int rob(int[] nums) {
        memo=new int[nums.length+1];
        Arrays.fill(memo, -1);
        return helper(nums, nums.length-1);
    }

    private int helper(int nums[], int i){
        if(i<0) return 0;

        if(memo[i]>=0) return memo[i];

        int ans=Math.max(helper(nums,i-2)+nums[i], helper(nums, i-1));
        memo[i]=ans;
        return ans;
    }
}