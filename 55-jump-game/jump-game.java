class Solution {
    public boolean canJump(int[] nums) {
        int rp=0;
        for(int i=0;i<nums.length;i++) {
            if(i>rp) {
                return false;
            }
            rp=Math.max(rp, i+nums[i]);
        }
        return true;
    }
}