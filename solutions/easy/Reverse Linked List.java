// Title: Reverse Linked List
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/reverse-linked-list/

 next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode forward = curr.next;

            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
}
