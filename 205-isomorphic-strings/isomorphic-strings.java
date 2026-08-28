class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> c = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(c.containsKey(sc)) {
                if(c.get(sc) != tc) return false;
            } else if(c.containsValue(tc)) return false;
            c.put(sc, tc);
        }
        return true;
    }
}