class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");

        char[] char_arr = (arr[arr.length - 1]).toCharArray();

        return char_arr.length;
    }
}
