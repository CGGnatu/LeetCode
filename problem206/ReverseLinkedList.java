/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev,curr,tempNext;
        curr=head;
        prev=null;
        while(curr!=null){
            tempNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tempNext;
        }
        return prev;
    }
}
