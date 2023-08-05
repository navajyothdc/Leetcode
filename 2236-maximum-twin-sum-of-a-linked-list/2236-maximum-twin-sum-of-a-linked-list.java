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
        int count = 0;
        int twinSum = 0;
        while(curr!=null){
            stack.push(curr);
            curr = curr.next;
        }
        curr=head;
        int size = stack.size();
        while(count<size){
            count++;
            twinSum = Math.max(twinSum, curr.val + stack.pop().val);
            curr = curr.next;
        }
        return twinSum;
    }
}