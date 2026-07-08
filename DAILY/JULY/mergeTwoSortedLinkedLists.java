public class mergeTwoSortedLinkedLists {
    public static Node mergeTwoLists(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        Node head;
        Node tail;

        if (list1.data <= list2.data) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        tail = head;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null)
            tail.next = list1;
        else
            tail.next = list2;

        return head;
    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        Node mergedList = mergeTwoLists(list1, list2);

        Node current = mergedList;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
