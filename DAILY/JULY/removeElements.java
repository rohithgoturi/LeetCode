public class removeElements {
    public static Node removeElement(Node head, int val) {
        while(head != null && head.data == val) 
           head = head.next;

        Node Node = head;

        while(Node != null && Node.next != null){
            if(Node.next.data == val){
                Node.next = Node.next.next;
            } else Node = Node.next;
        }

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
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(6);
        Node fourth = new Node(3);
        Node fifth = new Node(4);
        Node sixth = new Node(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        System.out.println("Original list:");
        printList(first);

        int valToRemove = 6;
        first = removeElement(first, valToRemove);

        System.out.println("List after removing elements with value " + valToRemove + ":");
        printList(first);
    }
}
