/*Marged two sorted List.
 Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists. */

public class MergedList(){

public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
ListNode temp = new ListNode(0);
ListNode LastNode = temp;

while(l1!=null && l2 != null)
{
if(l1.val<l2.val)
{
LastNode next = l1;
l1 = l1.next;
}
else
{
LastNode next = l2;
l2 = l2.next;
}
LastNode = LastNode.next;
}
if(l1!=null)
{
LastNode.next = l1;
}
if(l2!=null)
{
LastNode.next = l2;
}
return temp.next;
}
}