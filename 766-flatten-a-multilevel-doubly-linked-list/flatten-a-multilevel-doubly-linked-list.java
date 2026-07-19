class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;

        Node curr = head;

        while (curr != null) {
            if (curr.child == null) {
                curr = curr.next;
            } else {

                Node fwd = curr.next;

                Node child = flatten(curr.child);

                curr.child = null;
                curr.next = child;
                child.prev = curr;

                Node tail = child;
                while (tail.next != null) {
                    tail = tail.next;
                }

                tail.next = fwd;
                if (fwd != null) {
                    fwd.prev = tail;
                }

                curr = fwd;
            }
        }

        return head;
    }
}