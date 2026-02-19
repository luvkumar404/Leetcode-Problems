class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int i=0,j=0,sum=0;
        int minlen=Integer.MAX_VALUE;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                sum-=nums[i];
                minlen=Math.min(j-i+1,minlen);
                i++;
            }
            j++;
        }
        return (minlen==Integer.MAX_VALUE) ? 0:minlen;
    }
}