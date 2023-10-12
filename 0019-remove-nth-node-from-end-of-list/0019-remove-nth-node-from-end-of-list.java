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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode curr = head;
        while(curr.next != null){
            count++;
            curr = curr.next;
        }
        int index = count - n + 1;
        count = 0;
        ListNode current = head;
        ListNode prev = null;
        while(count < index){
            prev = current;
            current = current.next;
            count++;
        }
        // System.out.println(current.val);
        if (prev == null) {
            head = head.next;
            return head;
        } else {
            prev.next = prev.next.next;
            return head;
        }
    }
}