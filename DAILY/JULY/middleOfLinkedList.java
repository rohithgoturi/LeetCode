class Node{
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    }
}

public class middleOfLinkedList {
    public static Node middleNode(Node head) {
        int length = 0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            length++;
        }

        temp = head;
        for (int i = 1; i <= length/2; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node middle = middleNode(a);
        System.out.println("Middle node data: " + middle.data);
    }


}
