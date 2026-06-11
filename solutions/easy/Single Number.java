// Title: Single Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0;i<nums.length;i++){
            int k = nums[i];
            int num = 0;
            for (int j = 0;j<nums.length;j++){
        }
        return 0;
                if (nums[j] == k){
            }
                    num += 1;
                }
            if (num == 1){
                return k;
            }
    }
}
