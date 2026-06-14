class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> frq = new HashMap<>();
        for(int i:nums){
            if(frq.containsKey(i)){
                frq.put(i, frq.get(i)+1);
            } else {
                frq.put(i,1);
            }
        }
        int j=0;
        int res[]=new int[2];
        for(int i:nums){
            if(frq.get(i)==1){
                res[j]=i;
                j++;
            }
        }
        return res;
    }
}