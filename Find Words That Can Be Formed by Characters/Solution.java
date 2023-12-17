import java.util.ArrayList;

class Solution {
    public int countCharacters(String[] words, String chars) {
        char[] chars_arr = chars.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        for (char c : chars_arr) {
            list.add(c);
        }

        int sum = 0;
        for (String word : words) {
            int cnt = 0;
            ArrayList<Character> tempList = new ArrayList<>(list);  
            for (char c : word.toCharArray()) {
                if (tempList.contains(c)) {
                    tempList.remove(Character.valueOf(c));  
                    cnt++;
                }
            }
            if (cnt == word.length()) {
                sum += cnt;
            }
        }
        return sum;
    }
}
