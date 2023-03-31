
public class AddTwoNumMedium {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode answ = new ListNode();
        ListNode iteratorAnsw = answ;
        int carry=0;
        while (l1!=null || l2!=null || carry == 1){
            int sum = 0;
            if (l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }if (l2!=null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum+=carry;
            carry = sum/10;
            ListNode sumNode = new ListNode(sum % 10);
            answ.next = sumNode;
            answ = answ.next;
        }
        return answ;
    }
}
