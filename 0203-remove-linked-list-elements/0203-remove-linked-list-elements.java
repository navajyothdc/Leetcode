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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        if(head.next == null){
            if(head.val == val) return null;
            else return head;
        }
        ListNode next = head.next;
        ListNode prev = head;
        while(next != null){
            if(next.val == val){
                prev.next = next.next;
            }else{
                prev = prev.next;
            }
            if(prev.next != null){
                next = prev.next;
            } else{
                next = null;
            }
        }
        if(head.val == val) head = head.next;

        return head;
    }
}