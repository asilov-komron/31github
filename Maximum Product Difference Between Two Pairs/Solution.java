class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int term_1 = nums[0] * nums[1];
      
        
        int term_2 = nums[nums.length - 1] * nums[nums.length - 2];
        
        return term_2 - term_1;
    }
}
