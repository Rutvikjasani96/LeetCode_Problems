public class Problem_2 {
//    Add Two Numbers
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry=0;
        while(l1!=null || l2!=null){
            if(l1!=null && l2!=null){
                ListNode x = new ListNode((l1.val+l2.val+carry)%10);
                carry = (l1.val+l2.val+carry)/10;
                l1 = l1.next;
                l2 = l2.next;
                temp.next = x;
            }else if(l1!=null && l2==null){
                ListNode x = new ListNode((l1.val+carry)%10);
                carry = (l1.val+carry)/10;
                l1 = l1.next;
                temp.next = x;
            }else if(l1==null && l2!=null){
                ListNode x = new ListNode((l2.val+carry)%10);
                carry = (l2.val+carry)/10;
                l2 = l2.next;
                temp.next = x;
            }
            temp = temp.next;
        }
        if(carry!=0){
            temp.next = new ListNode(carry);
        }
        return ans.next;
    }
}
