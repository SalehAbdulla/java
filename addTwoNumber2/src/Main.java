public class Main {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3); // Represents the number 342

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4); // Represents the number 465

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        printNode(result); // Expected output: 7 -> 0 -> 8 -> null (807)
    }

    public static void printNode(ListNode node){
        while (node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("null");
    }
}