class Solution {
    public boolean isPalindrome(String s) {
        List<Character> set = new ArrayList<>();
        char[] chars = (s.toLowerCase()).toCharArray();

        for(char c : chars){
            if(Character.isLetter(c) || Character.isDigit(c) ){
                set.add(c);
            }
        }

        List<Character> list = new ArrayList<>(set);
        Collections.reverse(list);

       

        return set.equals(list);
    }
}
