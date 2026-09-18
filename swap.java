class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    void swapValue(Node head, int n) {

        // Find length
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // nth node from beginning
        Node first = head;

        for (int i = 1; i < n; i++) {
            first = first.next;
        }

        // nth node from end
        Node second = head;

        for (int i = 1; i < count - n + 1; i++) {
            second = second.next;
        }

        // Swap values
        int x = first.val;
        first.val = second.val;
        second.val = x;
    }

    void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

public class swap {

    public static void main(String[] args) {

        Add saif = new Add();

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Before:");
        saif.print(a);

        saif.swapValue(a, 2);

        System.out.println("\nAfter:");
        saif.print(a);
    }
}
