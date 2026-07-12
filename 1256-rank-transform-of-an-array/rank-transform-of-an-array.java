class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sorted[]=arr.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> rk = new HashMap<>();
        int c=1;
        for(int n:sorted){
            if(!rk.containsKey(n)){
                rk.put(n,c);
                c++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=rk.get(arr[i]);
        }
        return arr;
    }
}