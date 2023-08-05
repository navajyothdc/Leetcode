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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddList = new ListNode();
        ListNode evenList = new ListNode();
        ListNode temp = evenList;
        ListNode result = oddList;
        ListNode curr = head;
        int count =1;
        while(curr != null){
            if(count % 2 != 0){
                oddList.next = curr;
                oddList = oddList.next;
            } else{
                evenList.next = curr;
                evenList = evenList.next;
            }
            curr = curr.next;
            count++;
        }
        evenList.next = null;
        oddList.next = temp.next;
        return result.next;
    }
}