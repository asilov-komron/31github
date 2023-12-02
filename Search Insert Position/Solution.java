// Version 1

class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = nums.length;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                index = i;
            }
        }

        if(index == nums.length){
           
            for(int i = 0; i < nums.length; i++){
            if(nums[i] > target){
                index = i;
                break;
            }
            
            }
        
        }
    
        
    
        return index;
    }

}






// Version 2
 /*
class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = nums.length;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target || nums[i] > target){
                index = i;
                break;
            }
        }
    
        
    
        return index;
    }

}
*/

