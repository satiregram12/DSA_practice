// Title: Merge Intervals
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/merge-intervals/


        int[] current = intervals[0];

        for(int i=1;i<intervals.length;i++){

            if(intervals[i][0] <= current[1]){
                current[1] =
                        Math.max(current[1],
                                 intervals[i][1]);
            }
            else{
                ans.add(current);
                current = intervals[i];
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

    public int[][] merge(int[][] intervals) {

class Solution {
import java.util.*;

