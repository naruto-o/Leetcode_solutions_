https://leetcode.com/problems/linked-list-cycle-ii/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
// But our focus is on where the cycle has started. So, for that once they meet [slow == fast] then, we will reset the slow back to head & start moving slow with 1X speed and fast will carry on from where it was previously but with 1X speed
// Once slow & fast collab we will return either slow OR fast is same thing. As, they will return tail connects to node index 1
                slow = head;
                while(slow!=fast){
                    slow=slow.next;
                    fast= fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
