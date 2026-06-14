package LinkedList;


// 2130. Maximum Twin Sum of a Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode slow = head, fast = head;
        while(fast.next!= null && fast.next.next!=null){
            st.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
         st.push(slow.val);
         slow = slow.next;
        int max = Integer.MIN_VALUE;
        System.out.println(st);
        while(slow!=null && !st.isEmpty()){
            int ele = st.pop();
            max = Math.max(max,slow.val + ele);
            slow = slow.next;
        }
        return max;
    }

}
