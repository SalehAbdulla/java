public class ReverseNode {
    public static ListNode reverseNode(ListNode head) {
        ListNode prev = null;  // Initialize prev as null (this will be the new tail)

        while (head != null) {  // Traverse the list until the end
            ListNode next = head.next; // Store the next node
            head.next = prev;  // Reverse the current node's pointer
            prev = head;  // Move prev forward
            head = next;  // Move head forward
        }

        return prev;  // Prev is now the new head of the reversed list
    }
}
