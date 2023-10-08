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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode next = null;
        ListNode prev = null;
        ListNode curr = head;
        int count = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        // System.out.println(fast);
        if(fast != null && next != null){
            next = next.next;
        }
        while(next != null){
            if(prev.val != next.val){
                return false;
            }
            prev = prev.next;
            next = next.next;
        }
        return true;
    }
}