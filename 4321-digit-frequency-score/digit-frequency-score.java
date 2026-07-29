class Solution {
    public int digitFrequencyScore(int n) {
        int f[]=new int[10];
        while(n>0){
            f[n%10]++;
            n/=10;
        }
        int s=0;
        for(int i=0;i<=9;i++){
            s+=i*f[i];
        }
        return s;
    }
}