class Solution {
    public int totalMoney(int n) {
        int result = 0;
        for(int i = 0; i < n; i++){
            result += 1 + (i/7) + (i%7);
       
        }
    return result;
    }
}
