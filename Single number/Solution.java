// class Solution {
//     public int singleNumber(int[] nums) {
//         int result = 0;

//         for (int i = 0; i < nums.length; i++) {
//             if (result == nums[i]) {
//                 result = 0;
//             } else {
//                 result = nums[i];
//             }
//         }

//         return result;
//     }
// }


class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
