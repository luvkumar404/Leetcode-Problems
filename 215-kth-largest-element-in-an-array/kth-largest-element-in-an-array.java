class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i<k) {
                pq.offer(nums[i]);
            } else {
                if(pq.peek()<nums[i]){
                    pq.poll();
                    pq.offer(nums[i]);
                }
            }
        }
        return pq.poll();
    }
}