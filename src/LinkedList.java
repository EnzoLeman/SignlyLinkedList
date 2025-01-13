import java.util.Scanner;

class Node {
    int data;  // Data stored in the node
    Node next; // Reference to the next node

    // Constructor to initialize a node
    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

class LinkedList {
    private Node head; // Head pointer of the Linked List

    // Constructor to initialize the LinkedList
    public LinkedList() {
        this.head = null;
    }

    /* INSERT OPERATIONS */

    // Insert at the beginning
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) { // List is empty
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) { // Traverse to the end
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at a specific position
    public void insertAtPosition(int value, int pos) {
        Node newNode = new Node(value);

        if (pos == 1) { // Insert at the beginning if position is 1
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int currentPos = 1;

        // Traverse to the node just before the desired position
        while (temp != null && currentPos < pos - 1) {
            temp = temp.next;
            currentPos++;
        }

        if (temp == null) { // Position out of bounds
            System.out.println("Position out of bounds.");
            return;
        }

        // Insert the new Node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    /* DELETE OPERATION */

    public void deleteNode(int value) {
        if (head == null) { // Empty list
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        // If the node to delete is the head node
        if (head.data == value) {
            Node temp = head;
            head = head.next;
            System.out.println("Node with value " + value + " deleted.");
            return;
        }

        Node temp = head;
        Node prev = null;

        // Traverse to find the node to delete
        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) { // Value not found
            System.out.println("Value " + value + " not found in the list.");
            return;
        }

        // Delete the node
        prev.next = temp.next;
        System.out.println("Node with value " + value + " deleted.");
    }

    /* DISPLAY OPERATION */

    public void display() {
        if (head == null) { // Empty list
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    /* MAIN METHOD */

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete a Node");
            System.out.println("5. Display the List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at beginning: ");
                    int value1 = scanner.nextInt();
                    list.insertAtBeginning(value1);
                    break;

                case 2:
                    System.out.print("Enter value to insert at end: ");
                    int value2 = scanner.nextInt();
                    list.insertAtEnd(value2);
                    break;

                case 3:
                    System.out.print("Enter value to insert: ");
                    int value3 = scanner.nextInt();
                    System.out.print("Enter position to insert: ");
                    int position = scanner.nextInt();
                    list.insertAtPosition(value3, position);
                    break;

                case 4:
                    System.out.print("Enter value to delete: ");
                    int value4 = scanner.nextInt();
                    list.deleteNode(value4);
                    break;

                case 5:
                    System.out.print("Linked List: ");
                    list.display();
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
