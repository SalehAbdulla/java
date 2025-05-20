package dev.lpa;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(1);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(1);

        printNode(addTwoNumbers(l1, l2));

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int total = val1 + val2 + carry;
            carry = total / 10;
            current.next = new ListNode(total % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }
        return dummy.next;
    }


    public static void printNode(ListNode node){
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

}

