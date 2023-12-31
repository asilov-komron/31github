class Solution {
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length - 1;
       int result = 0;

       while(left < right){
           int current = Math.min(height[left],height[right]) * Math.abs(left - right);
           result = Math.max(current, result);

           if(height[left] > height[right]){
               right--;
           }
           else{
               left++;
           }
       }
       return result;
    }
}
