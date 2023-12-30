class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < deck.length; i++){
            if(map.containsKey(deck[i])) map.put(deck[i], map.get(deck[i]) + 1);
            else{

            map.put(deck[i], 1);
        }
        }
         int commonFactor = 0;
        for (int frequency : map.values()) {
            commonFactor = gcd(commonFactor, frequency);
        }

        return commonFactor > 1;
    }

   private int gcd(int a, int b) {
    if (b == 0) {
        return a;
    } 
    else {
        return gcd(b, a % b);
    }
}

}
