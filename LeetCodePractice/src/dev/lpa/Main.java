package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] twoSumSolution = TwoSum.twoSum(new int[] {6, 6, 11, 15}, 12);
        System.out.println(Arrays.toString(twoSumSolution));

        System.out.println("-".repeat(30));

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        //l1 = [2,4,3]    , l2 = [5,6,4]
        ListNode addTwoNumbers = AddTwoNumbers.addTwoNumbers(l1, l2);
        printNode(addTwoNumbers);

        System.out.println("-".repeat(30));
        String input = "abcabcbb";
        int longestSubString = LongestSubString.longestSubString(input);
        System.out.println("( " + input + " )" + " max substring is = " + longestSubString);


    }

    public static void printNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }

        System.out.println("null");
    }


}