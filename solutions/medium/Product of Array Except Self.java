// Title: Product of Array Except Self
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/product-of-array-except-self/

        // Left products
        answer[0] = 1;

        for(int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Right products
        int rightProduct = 1;

        for(int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct *= nums[i];
        }


        int n = nums.length;
        int[] answer = new int[n];

class Solution {
    public int[] productExceptSelf(int[] nums) {
