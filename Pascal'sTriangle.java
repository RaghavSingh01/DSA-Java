class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList();
        for(int i = 1; i <= numRows; i++){
            List<Integer> temp = new ArrayList();
            if (i == 1){
                res.add(Arrays.asList(1));
            }
            else if (i == 2){
                res.add(Arrays.asList(1,1));
            }
            else{
                for(int j = 0; j < i; j++){
                    if(j == 0 || j == i - 1){
                        temp.add(1);
                    }
                    else{
                        int x = res.get(i-2).get(j-1) + res.get(i-2).get(j);
                        temp.add(x);
                    }
                }
                res.add(temp);
            }
        }
        return res;

    }
}