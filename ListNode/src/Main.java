public class Main {
    public static void main(String[] args) {
        ListNode p = new ListNode(9);
        p.next = new ListNode(8);
        p.next.next = new ListNode(7);

        ListNode q = new ListNode(9);
        p.next = new ListNode(8);
        p.next.next = new ListNode(7);

        //printNode(p);
        ListNode result = addTwoNumbers(p, q);
        System.out.print(result);
    }

    public static void printNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("null");
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to simplify code
        ListNode current = dummyHead; // Pointer to build the new list
        int carry = 0; // Initialize carry to 0

        // Traverse both lists
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with the carry

            // Add the value from l1 if it exists
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // Move to the next node
            }

            // Add the value from l2 if it exists
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // Move to the next node
            }

            // Compute the new digit and the new carry
            carry = sum / 10; // Calculate carry for the next iteration
            current.next = new ListNode(sum % 10); // Create a new node for the current digit
            current = current.next; // Move to the next node in the result
        }

        return dummyHead.next; // Return the head of the new list (skip dummy node)
    }

}