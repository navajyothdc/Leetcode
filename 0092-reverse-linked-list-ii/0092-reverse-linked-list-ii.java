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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode next = null;
        int count =1;
        if(right == 1) return head;
        while(count<left-1){
            count++;
            curr = curr.next;
        }
        
        ListNode leftLink = curr;
        ListNode prev = new ListNode();
        ListNode start = new ListNode();
        if(left == 1){
            count = -1;
            prev = null;
            start = curr;
        } else{
            prev = curr.next;
            start = prev;
            curr = prev.next;
        }
        while(count < right-1){
            count++;
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(left != 1){
            leftLink.next = prev;
        }
        start.next = curr;
        return left ==1? prev : head;
    }
}