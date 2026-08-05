class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>l=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        int n=nums.length;
        for(int i=min+1;i<max;i++){
             boolean isfound=false;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    isfound=true;
                    break;
                }
            }
            if(!isfound){
                l.add(i);
            }

        }
        return l;
    }
}