class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int cnt=1;
        for(int i=0;i<n;i++){
            if(cnt==nums[i]) cnt++;
            else if(nums[i]>cnt) return cnt;
        }
        return cnt;
    }
}