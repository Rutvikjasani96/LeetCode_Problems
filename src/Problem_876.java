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

public class Problem_876 {
//    Middle of the Linked List
    public ListNode middleNode(ListNode head) {
        int nodeNum = size(head)/2;
        for(int i=0;i<nodeNum;i++){
            head = head.next;
        }
        return head;
    }
    int size(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}
