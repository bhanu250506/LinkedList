class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }

    private Node head;

    // Insert at the end
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Print list from head to tail
    public void printListForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print list from tail to head
    public void printListBackward() {
        Node temp = head;
        if (temp == null) return;
        
        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertEnd(100);
        list.insertEnd(200);
        list.insertEnd(300);
        
        System.out.println("Doubly Linked List (Forward):");
        list.printListForward();
        
        System.out.println("Doubly Linked List (Backward):");
        list.printListBackward();
    }
}
