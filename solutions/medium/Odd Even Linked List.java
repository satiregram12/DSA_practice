// Title: Odd Even Linked List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/odd-even-linked-list/

        ListNode oddTail = head;

        ListNode evenHead = head.next;
        ListNode evenTail = head.next;

        while (evenTail != null && evenTail.next != null) {

            oddTail.next = evenTail.next;
            oddTail = evenTail.next;

        ListNode oddHead = head;
            evenTail.next = oddTail.next;
            evenTail = oddTail.next;
        }

        oddTail.next = evenHead;

        return oddHead;
    }
}
