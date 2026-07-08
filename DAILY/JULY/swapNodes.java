public class swapNodes {
    public static Node swapingNodes(Node head, int k) {
        Node fast = head;
        Node slow = head;

        for(int i=1; i<k; i++){
            fast = fast.next;
        }

        Node starting = fast;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        int temp = starting.data;
        starting.data = slow.data;
        slow.data = temp;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;
        head = swapingNodes(head, k);
        
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
