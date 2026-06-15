// 2095. Delete the Middle Node of a Linked List
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null)
            return head;
        if(head.next == null)
            return head.next;
        ListNode prev = null;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next != null) {
            prev = slow;
            slow = slow.next;
        }
        if (prev != null)
            prev.next = slow.next;
        return head;
    }
}