class Solution {
    public int repeatedNTimes(int[] nums) {
        int nn = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            if(!map.containsKey(n)){
                map.put(n,1);
            }
            else {
                map.put(n, map.get(n) + 1);
                if (map.get(n) == nn) {
                    return n;
                }
            
             }
           }

        return map.get(nn);
    }
}
