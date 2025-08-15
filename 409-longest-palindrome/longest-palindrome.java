class Solution {
    public int longestPalindrome(String s) {
        Set<Character> st = new HashSet<>();
        int cnt = 0;
        for(Character c:s.toCharArray()) {
            if(st.contains(c)) {
                st.remove(c);
                cnt++;
            }
            else {
                st.add(c);
            }
        }
        if(!st.isEmpty()) {
            return cnt*2+1;
        }
        return cnt*2;
    }
}