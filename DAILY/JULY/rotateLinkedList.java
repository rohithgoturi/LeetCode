public class rotateLinkedList {
    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        int length = 1;
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k %= length;

        if (k == 0)
            return head;

        int steps = length - k;

        Node curr = head;
        for (int i = 1; i < steps; i++) {
            curr = curr.next;
        }

        Node newHead = curr.next;
        curr.next = null;
        tail.next = head;

        return newHead;
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
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Original list:");
        printList(first);

        int k = 2;
        first = rotateRight(first, k);

        System.out.println("List after rotating right by " + k + " positions:");
        printList(first);
    }
}
