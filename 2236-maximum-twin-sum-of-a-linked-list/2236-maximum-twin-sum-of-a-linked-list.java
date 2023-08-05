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
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        ListNode fast = head;
        ListNode next = null;
        ListNode prev = null;
        int count = 0;
        int twinSum = 0;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        while(prev!=null){
            twinSum = Math.max(twinSum, prev.val+next.val);
            next = next.next;
            prev = prev.next;
        }
        return twinSum;
    }
}