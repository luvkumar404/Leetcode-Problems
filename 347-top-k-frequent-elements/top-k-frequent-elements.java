class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            m.put(num, m.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> m.get(b) - m.get(a));
        for(int key:m.keySet()){
            pq.offer(key);
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll();
        }
        return res;
    }
}