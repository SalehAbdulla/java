public class Main {
    public static void main(String[] args) {
        // Input: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(3);
        printNode(Solution.sumListNode(l1, l2));
    }

    public static void printNode(ListNode node){
        while (node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("null\n");
    }
}
