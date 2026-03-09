package leet;


/***Hare and tortoise problem two pointer
 one is 2x fast and another is half of it. at last smaller
 */

public class MiddleOfLinkedList {
        public ListNode middleNode(ListNode head) {
            ListNode slow=head,fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
}
