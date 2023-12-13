class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int pre_max = 0;

        for(int num : nums){
            if(num >= max){
                pre_max = max;
                max = num;
                
            }
            else if (num > pre_max && num < max){
                pre_max = num;
            }
        }

        return (max - 1) * (pre_max - 1);
    }
}
/*2nd solution*/

/*class Solution {
    public int maxProduct(int[] nums) {
        int pre_result = 0;
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i == j) continue;
                if(nums[i] * nums[j] > pre_result){
                    pre_result = nums[i] * nums[j];
                    result = (nums[i] - 1) * (nums[j] - 1);
                }
            }
        }
        return result;
    }
}*/
