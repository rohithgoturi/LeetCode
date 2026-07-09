public class partitionList {
    public static Node partition(Node head, int x) {
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);

        Node t1 = d1;
        Node t2 = d2;

        Node t = head;

        while (t != null) {
            if (t.data < x) {
                t1.next = t;
                t1 = t1.next;
            } else {
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
        }

        t1.next = d2.next;
        t2.next = null;

        return d1.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        int x = 3;

        Node partitionedList = partition(head, x);

        Node current = partitionedList;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
