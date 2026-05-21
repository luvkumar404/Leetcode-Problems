class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int m=g.length;
        int n=s.length;
        int i=0, j=0;
        int cnt=0;

        while(i<g.length && j<s.length) {
            if(s[j]>=g[i]) {
                i++;
                j++;
                cnt++;
            } else {
                j++;
            }
        }
        return cnt;
    }
}