class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int n=word.length();
        
        for(int i=0;i<n;) {
            char c = word.charAt(i);
            int info=0;
            while(i<n && word.charAt(i) == c && info<9) {
                info++;
                i++;
            }
            sb.append(info).append(c);
        }
        return sb.toString();
    }
}