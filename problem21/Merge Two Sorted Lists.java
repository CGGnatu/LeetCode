/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode re=new ListNode(0);
        ListNode p=l1,q=l2,curr=re;
        while(p!=null||q!=null){
            int x=p!=null?p.val:Integer.MAX_VALUE;
            int y=q!=null?q.val:Integer.MAX_VALUE;
            if(x<=y){
                curr.next=new ListNode(x);
                p=p.next;
            }
            else{
                curr.next=new ListNode(y);
                q=q.next;
            }
            curr=curr.next;
        }
        return re.next;
    }
}
