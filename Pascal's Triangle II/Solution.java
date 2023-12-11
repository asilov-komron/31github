class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> container = new ArrayList<>();
        int len = rowIndex + 1;
        for(int i = 0; i < len; i++){
            
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    int val = container.get(i-1).get(j-1) + container.get(i-1).get(j);
                    row.add(val);
                }
                
            }
            container.add(row);
        }

        return container.get(rowIndex);

    }
}
