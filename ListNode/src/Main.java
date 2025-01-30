public class Main {
    public static void main(String[] args) {
        ListNode p = new ListNode(9);
        p.next = new ListNode(8);
        p.next.next = new ListNode(7);

        printNode(p);
    }

    public static void printNode(ListNode node){
        while (node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;

    }
}