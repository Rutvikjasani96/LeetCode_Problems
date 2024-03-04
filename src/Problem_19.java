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
public class Problem_19 {
//    Remove Nth Node From End of The List
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = size(head);
        int i = 0, traverseTill = length - n - 1;
        if(traverseTill == -1){
            return head.next;
        }
        ListNode temp = head;
        while(i < traverseTill){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
    int size(ListNode head){
        ListNode temp = head;
        int size =0 ;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}
