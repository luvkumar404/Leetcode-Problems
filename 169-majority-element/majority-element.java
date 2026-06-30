class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                cnt++;
            }
            else {
                cnt=1;
            }

            if(cnt > nums.length/2) return nums[i];
        }
        return nums[0];
    }
}