class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    Node swapPairs(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node curr = head;

        // New head will be second node
        head = head.next;

        while (curr != null && curr.next != null) {

            Node second = curr.next;
            Node nextPair = second.next;

            // Swap
            second.next = curr;
            curr.next = nextPair;

            // Connect previous pair
            if (prev != null) {
                prev.next = second;
            }

            // Move to next pair
            prev = curr;
            curr = nextPair;
        }

        return head;
    }

    void print(Node head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }
}

public class swapPair {

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

        head = obj.swapPairs(head);

        System.out.println("After:");
        obj.print(head);
    }
}
