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
        ListNode dummyHead = new ListNode(0);
        ListNode p=l1, n=l2, curr=dummyHead;
        int carry=0;
        while(p!=null || n!=null)
        {
            int x=(p!=null) ? p.val:0;
            int y=(n!=null) ? n.val:0;
            int sum = carry+x+y;
            carry=sum/10;
            curr.next = new ListNode(sum % 10);
            curr=curr.next;
            if(p!=null) 
                p = p.next;
            if(n!=null)
                n = n.next;
        }
        if(carry > 0)
        {
            curr.next=new ListNode(carry);
        }
        return dummyHead.next;
        
    }
}