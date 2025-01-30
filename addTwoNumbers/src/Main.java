public class Main {
    public static void main(String[] args) {

        ListNode p = new ListNode(2);
        p.next = new ListNode(4);
        p.next.next = new ListNode(3);

        ListNode q = new ListNode(5);
        q.next = new ListNode(6);
        q.next.next = new ListNode(4);

        printList(q);
    }

    // Helper function to print a linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

}
