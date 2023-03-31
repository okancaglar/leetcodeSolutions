public class RemoveDuplicatesFrmSrtdList {
    public ListNode deleteDuplicates(ListNode head){
        ListNode i = head;
        ListNode j = head.next;
        ListNode k = head;
        while (i.next != null){
            while (j!=null){
                if (i.val == j.val){
                    k.next = j.next;
                    j = j.next;
                }else {
                    k = j;
                    j = j.next;
                }
            }
            i = i.next;
            k = i;
            j = k.next;
        }
        return head;
    }
}
