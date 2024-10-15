class CircularLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node last;

    // Insert at the end
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;  // Points to itself
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    // Traverse circular linked list
    public void printList() {
        if (last == null) return;

        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);

        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertEnd(5);
        list.insertEnd(10);
        list.insertEnd(15);
        
        System.out.println("Circular Linked List:");
        list.printList();
    }
}
