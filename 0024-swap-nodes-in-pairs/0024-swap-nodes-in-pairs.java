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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode previous = temp;
        ListNode current = head;
        ListNode next = (current != null)?current.next:null;

        while(next != null){
            previous.next = next;
            current.next = next.next;
            next.next = current;

            previous= current;
            current = current.next;
            next = (current != null)?current.next:null;
        }
        return temp.next;

    }
}