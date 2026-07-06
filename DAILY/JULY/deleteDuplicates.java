public class deleteDuplicates {
    public static Node deleteDuplicateNode(Node head) {
        if (head == null)
            return head;

        Node node = head;

        while (node.next != null) {
            if (node.data == node.next.data)
                node.next = node.next.next;
            else {
                node = node.next;
            }
        }

        node = node.next;

        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Original list:");
        printList(head);

        head = deleteDuplicateNode(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}
