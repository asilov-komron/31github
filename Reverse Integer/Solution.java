class Solution {
    public int reverse(int x) {
       int temp_x = x;
       if(x < 0) temp_x = -x;
       
        long rev_num = 0;
        while(temp_x > 0){
            
            int digit = temp_x % 10;
          

            rev_num = rev_num * 10 + digit;

            temp_x = temp_x / 10;
        }
        if(rev_num > Math.pow(2, 31) - 1 || rev_num < Math.pow(-2, 31)) return 0;

        if(x < 0) rev_num = -rev_num;


        return (int) rev_num;

    }
}
