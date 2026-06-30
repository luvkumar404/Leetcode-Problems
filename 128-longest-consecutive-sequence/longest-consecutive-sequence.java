class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) return 0;

        int n = nums.length;
        int cnt=1, longest=1;
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            else if(nums[i] == nums[i-1]+1){
                cnt++;
            }
            else {
                longest=Math.max(longest, cnt);
                cnt=1;
            }
        }
        return Math.max(longest, cnt);
    }
}