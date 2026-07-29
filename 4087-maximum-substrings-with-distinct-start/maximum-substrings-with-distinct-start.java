class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set=new HashSet<>();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))) {
                cnt++;
                set.add(s.charAt(i));
            }
        }
        return cnt;
    }
}