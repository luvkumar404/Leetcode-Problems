class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt=0;
        for(int i=0;i<jewels.length();i++){
            int j=0;
            while(j < stones.length()) {
                if(stones.charAt(j)==jewels.charAt(i)){
                    cnt++;
                }
                j++;
            }
        }
        return cnt;
    }
}