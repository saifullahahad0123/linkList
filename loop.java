class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    boolean detectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          
            fast = fast.next.next;     

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

public class loop {

    public static void main(String[] args) {

        Add saif = new Add();

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;

        d.next = c;

        if (saif.detectLoop(a)) {
            System.out.println("Loop detected");
        } else {
            System.out.println("No loop");
        }
    }
}
