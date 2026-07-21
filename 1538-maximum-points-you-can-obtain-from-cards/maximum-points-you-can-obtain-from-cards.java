class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int lsum=0, rsum=0, maxlen=0;
        for(int i=0;i<k;i++){
            lsum=lsum+cardPoints[i];
            maxlen=lsum;
        }
        int ridx=n-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[ridx];
            ridx=ridx-1;
            maxlen=Math.max(maxlen, lsum+rsum);
        }
        return maxlen;
    }
}