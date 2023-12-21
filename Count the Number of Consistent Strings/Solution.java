class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] allowed_ch = allowed.toCharArray();
        List<Character> allowed_char = new ArrayList<>();
        
        for (char ch : allowed_ch) {
            allowed_char.add(ch);
        }        int cnt = 0;

        for(int i = 0; i < words.length; i++){
            char[] temp = words[i].toCharArray();
            boolean flag = true;
            
            for(int j = 0; j < temp.length; j++){
            if(!allowed_char.contains(temp[j])){
                flag = false;
            break;
                }
            
            }
            if(flag){
            cnt++;}
        }
        return cnt;
    }
}
