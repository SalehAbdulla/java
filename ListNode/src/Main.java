public class Main {
    public static void main(String[] args) {

        // Create individual nodes
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);

        // connect node2 with node1
        node1.next = node2;
        // connect node3 with node2
        node2.next = node3;

        // Traverse and print the list
        ListNode current = node1;
        while (current != null){
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
