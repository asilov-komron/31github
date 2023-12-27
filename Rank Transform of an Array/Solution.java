class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] sorted_arr = arr.clone();
              Arrays.sort(sorted_arr);

        for(int num : sorted_arr){
        System.out.println(num);}



        for (int i = 0; i < sorted_arr.length; i++) {
    if (!map.containsKey(sorted_arr[i])) {
        map.put(sorted_arr[i], map.size() + 1);
    }
    
}


        for(int i = 0; i < arr.length; i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;
    
    
    }
}
