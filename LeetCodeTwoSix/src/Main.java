public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(7);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(7);

        printNode(Solution.addNodes(l1, l2));
    }

    public static void printNode(ListNode node){
        while (node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("null");
    }
}