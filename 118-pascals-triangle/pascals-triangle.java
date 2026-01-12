class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a=new ArrayList<>();
        a.add(0, List.of(1));
        for(int i=1;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            temp.add(1);
            a.add(i,temp);
        }
        
        for(int i=2;i<numRows;i++){
            for(int j=1;j<i;j++){
                a.get(i).add(j, a.get(i - 1).get(j - 1) + a.get(i - 1).get(j));
            }
        }
        return a;
    }
}