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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode curr3 = new ListNode();
        ListNode result = curr3;
        int sum = 0;

        while(true){
            sum = 0;
            if(curr1 == null && curr2 == null){
                if(carry>0){
                    ListNode temp = new ListNode(carry);
                    curr3.next = temp;
                }
                break;
            }
            if(curr1 != null){
                sum = curr1.val;
                curr1 = curr1.next;
            }
            if(curr2 != null){
                sum = sum + curr2.val;
                curr2 = curr2.next;
            }
            ListNode ln = new ListNode();
            sum = sum + carry;
            if(sum >= 10){
                carry = sum/10;
                sum = sum % 10;
            }else{
                carry = 0;
            }
            ln.val = sum;
            curr3.next = ln;
            curr3 = curr3.next;
        }
        return result.next;
    }
}