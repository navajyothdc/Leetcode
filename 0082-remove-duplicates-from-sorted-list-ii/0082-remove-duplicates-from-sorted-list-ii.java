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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        if (curr == null || curr.next == null) return head;
        while(curr != null && curr.next!=null){

            if(curr.val == curr.next.val){
                ListNode temp = removeList(curr);
                ListNode next = temp.next;
                curr = next;
                if(prev != null){ 
                    prev.next = next;
                    curr = prev;
                }else if(next == null || temp.val != next.val){
                    head = next;
                }
            } else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
    public ListNode removeList(ListNode node){
        while(node.next != null && node.val == node.next.val){
            node = node.next;
        }
        return node;
    }
}