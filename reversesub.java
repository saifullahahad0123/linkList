class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    Node reverseSubList(Node head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        // Dummy node helps when left = 1
        Node dummy = new Node(-1);
        dummy.next = head;

        // Move prev to node before left
        Node prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // curr is the first node to reverse
        Node curr = prev.next;

        // Reverse the sublist
        for (int i = 0; i < right - left; i++) {

            Node next = curr.next;

            curr.next = next.next;

            next.next = prev.next;

            prev.next = next;
        }

        return dummy.next;
    }

    void print(Node head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }
}

public class reversesub {

    public static void main(String[] args) {

        Add obj = new Add();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("Before:");
        obj.print(head);

        head = obj.reverseSubList(head, 2, 5);

        System.out.println("After:");
        obj.print(head);
    }
}
