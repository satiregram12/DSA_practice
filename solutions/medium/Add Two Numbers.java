// Title: Add Two Numbers
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/add-two-numbers/

                p1 = p1.next;

            if (p2 != null)
                p2 = p2.next;
        }

        if (carry != 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
            if (p1 != null)

