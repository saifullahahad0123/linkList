class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    void removeDuplicates(Node head) {

        Node temp = head;

        while (temp != null && temp.next != null) {

            if (temp.val == temp.next.val) {

                // Remove duplicate node
                temp.next = temp.next.next;

            } else {

                temp = temp.next;
            }
        }
    }

    void print(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

public class duplicate {

    public static void main(String[] args) {

        Add saif = new Add();

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(20);
        Node d = new Node(30);
        Node e = new Node(30);
        Node f = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Before:");
        saif.print(a);

        saif.removeDuplicates(a);

        System.out.println("\nAfter:");
        saif.print(a);
    }
}