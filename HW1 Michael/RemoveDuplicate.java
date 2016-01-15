/* Remove Duplicates from Sorted List
 Given a sorted linked list, delete all duplicates such that each element appear only once. 
For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.*/

public class RemoveDuplicateSortedList {
    public ListedList deleteDuplicates(ListNode node, HEAD head) {
        if(head == null || head.next == null)   return head;
         
         node = head;
         
        while(node != null) {
            ListNode p1 = node.next;
            while(p1 != null && node.val == p1.val) {
                p1 = p1.next;
            }
            node.next = p1;
            node = node.next;
        }
         
        return head;
    }
}

