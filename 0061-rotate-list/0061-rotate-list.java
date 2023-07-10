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
    public ListNode rotateRight(ListNode head, int k) {
        int rotations = 0;
        int count = 1;
        ListNode curr = head;
        int length = 0;
        if(curr == null) return curr;
        while(curr.next != null){
            curr = curr.next;
            length++;
        }
        rotations = (length+1) - (k % (length+1)); 
        ListNode currNew = head;
        while(count < rotations){
            count++;
            currNew = currNew.next;
        }
        ListNode startNode = head;
        if(rotations>0){
            curr.next = head;
            startNode = currNew.next;
            currNew.next = null;
        }
        return startNode;
    }
}