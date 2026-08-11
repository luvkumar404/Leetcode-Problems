class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        for (int i=1;i<n&&nums[i]==nums[i-1]+1;i++) {
            sum += nums[i];
        }

        while(true) {
            boolean found = false;
            for (int i=0;i<n;i++) {
                if (nums[i]==sum) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return sum;
            }
            sum++;
        }
    }
}