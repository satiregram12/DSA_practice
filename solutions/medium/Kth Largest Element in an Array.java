// Title: Kth Largest Element in an Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.PriorityQueue;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num:nums){
        }
        return minHeap.peek();

            minHeap.add(num);
            if (minHeap.size()>k){
                minHeap.poll();
            }
    }
}
