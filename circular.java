import java.util.Scanner;

public class circular {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Insert at End
    public void addEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } 
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Delete Last Node
    public void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node current = head;

        while (current.next != tail) {
            current = current.next;
        }

        tail = current;
        tail.next = head;
    }

    // Display Circular Linked List
    public void traverse() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } 
        while (current != head);

        System.out.println();
    }

    public static void main(String[] args) {

        circular cl = new circular();
        Scanner sc = new Scanner(System.in);

        int ch, val;

        do {

            System.out.println("\n----- Circular Linked List Menu -----");
            System.out.println("1. Insert at End");
            System.out.println("2. Delete Last");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    cl.addEnd(val);
                    System.out.println("Successfully Inserted");
                    break;

                case 2:
                    cl.deleteLast();
                    System.out.println("Successfully Deleted");
                    break;

                case 3:
                    System.out.println("Circular Linked List:");
                    cl.traverse();
                    break;

                case 4:
                    System.out.println("Program Exited");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (ch != 4);

        sc.close();
    }
}