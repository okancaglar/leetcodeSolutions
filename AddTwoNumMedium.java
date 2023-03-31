
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



    public static void main(String[] args) {
        AddTwoNumMedium test = new AddTwoNumMedium();
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode answ = test.addTwoNumbers(l1,l2);
        while (answ.next!=null){
            System.out.print(answ.val);
            answ = answ.next;
        }
    }
}
