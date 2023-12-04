class Solution {
    public int[] plusOne(int[] digits) {
       
        
        for(int i = digits.length - 1; i >= 0; i-- ){
            if(digits[i] == 9){
                digits[i] = 0;
                continue;

            }

            digits[i]++;
            break;
        }
        
        if(digits[0] == 0){
            int[] new_arr = new int[digits.length + 1];
            new_arr[0] = 1;
            for(int i = 1; i < new_arr.length; i++){
                new_arr[i] = digits[i-1];
            }

            return new_arr;
        }




        return digits;


    }
}
