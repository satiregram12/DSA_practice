// Title: Merge Nodes in Between Zeros
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/merge-nodes-in-between-zeros/

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode read = head.next;
        while (read != null){
            int sum = 0;
        ListNode write = head;
            while (read.val != 0){
                sum = sum + read.val;
            }
                read = read.next;
            write.val = sum;
            write.next = read.next;
            read = read.next;
            write = write.next;
        }
    }
        return head;
}
