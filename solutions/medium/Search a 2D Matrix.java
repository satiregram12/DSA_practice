// Title: Search a 2D Matrix
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-a-2d-matrix/


            int mid = low + (high-low)/2;

            int row = mid / n;
            int col = mid % n;

            if(matrix[row][col] == target)
                return true;


        while(low <= high){
        int low = 0;
        int high = m*n - 1;
        int n = matrix[0].length;

class Solution {

    public boolean searchMatrix(int[][] matrix,
                                int target) {

        int m = matrix.length;
