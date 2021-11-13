// Reverse a LinledList
class Solution {
    // Two pointer approch
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    // Recursive approach
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
}
// Time complexity: O(n) --> Bcz we took exactly n nodes to perform n objectives.
// Space complexity: O(1) --> Bcz we reversed the given LinkedList only. We didn't use any external LinkedList.