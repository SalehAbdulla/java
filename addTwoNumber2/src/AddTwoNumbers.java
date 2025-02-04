public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // temp list node for answer storage
        ListNode dummy = new ListNode(0);
        // a reference for the storage
        ListNode current = dummy;
        // this carry in case we've got tenth value, /10 then %10 to extract last number
        int carry = 0;
        // as long there's exist value, keep the loop
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            // add everything
            int sum = val1 + val2 + carry;
            // extract first digit, sum < 10 ? carry = 0
            carry = sum / 10;
            // add last digit only to the answer storage
            current.next = new ListNode(sum % 10);

            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }


}
