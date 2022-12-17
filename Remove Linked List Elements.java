https://leetcode.com/problems/remove-linked-list-elements/
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode cur = head;
        ListNode prev = head;
        
        while(cur !=null){
            if(cur.val == val){
                prev.next = cur.next;
            }
            else{
                prev = cur;
            }
        }
        return temp.next;
    }
}
 
