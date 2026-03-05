class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int l=0, r=nums.length-1;
        int max=Integer.MIN_VALUE;
        while(l<r){
            int s=nums[l]+nums[r];
            if(s==0){
                max=Math.max(max,nums[r]);
                l++;
                r--;
            } else if(s<0){
                l++;
            } else {
                r--;
            }
        }
        return max != Integer.MIN_VALUE ? max:-1;
    }
}