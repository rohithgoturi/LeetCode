public class mergeSort {
    public static Node mergeSortLinkedList(Node head) {

        if(head.next == null) return head;
        
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node head2 = slow.next;
        slow.next = null;
        
        head = mergeSortLinkedList(head);
        head2 = mergeSortLinkedList(head2);
        
        return merge(head, head2);
        
    }
    
    public static Node merge(Node head1, Node head2) {
        Node first = head1;
        Node second = head2;
        
        Node dummy = new Node(-1);
        Node k = dummy;
        
        while(first != null && second != null){
            if(first.data >= second.data) {
                k.next = second;
                second = second.next;
            }
            else{
                k.next = first;
                first = first.next;
            }
            
            k = k.next;
        }
        
        if(first == null) k.next = second;
        else  k.next = first;
        
        return dummy.next;
    }

    public static void main(String[] args) {
        Node a = new Node(30);
        Node b = new Node(10);
        Node c = new Node(50);
        Node d = new Node(20);
        Node e = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node sortedHead = mergeSortLinkedList(a);

        Node current = sortedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
