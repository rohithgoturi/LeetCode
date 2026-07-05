public class intersectionNode {
    public static Node getIntersectionNode(Node headA, Node headB) {
        Node temp1 = headA;
        Node temp2 = headB;

        int len1=0;
        while(temp1 != null){
            temp1 = temp1.next;
            len1++;
        }

        int len2=0;
        while(temp2 != null){
            temp2 = temp2.next;
            len2++;
        }

        temp1 = headA;
        temp2 = headB;

        if(len1 > len2){
            for(int i = 0; i<len1-len2; i++){
                temp1 = temp1.next;
            }
        }
        else{
            for(int i=0; i<len2-len1; i++){
                temp2 = temp2.next;
            }
        }

        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }

    public static void main(String[] args) {
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = new Node(4);
        headA.next.next.next.next = new Node(5);

        Node headB = new Node(6);
        headB.next = headA.next.next; // Intersection at node with value 3

        Node intersectionNode = getIntersectionNode(headA, headB);
        if (intersectionNode != null) {
            System.out.println("Intersection node value: " + intersectionNode.data);
        } else {
            System.out.println("No intersection node found.");
        }
    }
}
