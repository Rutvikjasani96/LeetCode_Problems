import java.util.LinkedList;

public class Problem_234 {
//    Palindrome Linked List
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
    static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverseList(slow.next);
        while(rev!=null){
            if(head.val!=rev.val){
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }
    static ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = head.next;
        while(temp!=null){
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
        }
        curr.next = prev;
        return curr;
    }
}
