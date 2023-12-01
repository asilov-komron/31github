class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int unique_count = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[unique_count] = nums[i];
                unique_count++;
            }
        }

        
        return unique_count;
    }
}



