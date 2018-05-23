/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr;
        curr=head;
        if(head==null) return head;
        while(curr.next!=null){
            if(curr.next.val==val) curr.next=curr.next.next;
            else curr=curr.next;
        }
        return head.val==val?head.next:head;
    }
}
