public class MergeTwoSortedList {
    public ListNode mergeTwoSortedList(ListNode list1,ListNode list2){

        ListNode iterator1 = list1;
        ListNode iterator2 = list2;

        ListNode sol = new ListNode(0);
        ListNode solIterator = sol;

        while (iterator1 != null && iterator2 != null){
            if(iterator1.val > iterator2.val) {
                ListNode newVal = new ListNode(iterator2.val);
                solIterator.next = newVal;

                iterator2 = iterator2.next;
                solIterator = solIterator.next;
            }else {
                ListNode newVal = new ListNode(iterator1.val);
                solIterator.next = newVal;

                iterator1 = iterator1.next;
                solIterator = solIterator.next;
            }
        }while (iterator1!=null){
            ListNode newVal = new ListNode(iterator1.val);
            solIterator.next = newVal;

            iterator1 = iterator1.next;
            solIterator = solIterator.next;
        }while (iterator2!=null){
            ListNode newVal = new ListNode(iterator2.val);
            solIterator.next = newVal;

            iterator2 = iterator2.next;
            solIterator = solIterator.next;
        }
        sol = sol.next;
        return sol;
    }

    public static void main(String[] args) {
    }
}
