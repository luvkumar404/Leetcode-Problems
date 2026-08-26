class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums) {
            if(set.contains(num)) res.add(num);
            set.add(num);
        }
        return res;
    }
}