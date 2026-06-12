// Title: Container With Most Water
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/container-with-most-water/


        int maxArea = 0;

        while(left < right) {

            int area =
                Math.min(height[left], height[right])
                * (right - left);

            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        int right = height.length - 1;
        int left = 0;

    public int maxArea(int[] height) {
class Solution {
