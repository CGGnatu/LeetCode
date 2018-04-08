/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode operator=head;
        while(operator!=null&&operator.next!=null){
            if(operator.val==operator.next.val){
                operator.next=operator.next.next;
            }
            else operator=operator.next;
        }
        return head;
    }
}
