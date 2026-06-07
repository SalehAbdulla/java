import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Node node = new Node("Orange");

        Node node2 = new Node("Apple");
        node.next = node2;

        Node node3 = new Node("Pineapple");
        node2.next = node3;


        printLinkedList(node);


    }

    public static void printLinkedList(Node node) {
        while (node != null) {
            System.out.print(node.val);

            if (node.next != null) {
                System.out.print(" -> ");
            }

            node = node.next;
        }
        System.out.println(" -> null");
    }


}