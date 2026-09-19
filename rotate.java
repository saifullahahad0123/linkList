class Node {
    int vel;
    Node next;

    Node(int vel) {
        this.vel = vel;
    }
}

class add {

    Node rotateNode(Node head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        
        int n = 0;
        Node temp = head;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // If k is greater than length
        k = k % n;

        if (k == 0) {
            return head;
        }

        Node fast = head;
        Node slow = head;

      
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        Node newHead = slow.next;

     
        slow.next = null;

        
        fast.next = head;

        return newHead;
    }

    void print(Node head) {

        if (head == null) return;

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.vel + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class rotate {

    public static void main(String[] args) {

        add add = new add();

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        add.print(a);

        a = add.rotateNode(a, 3);

        add.print(a);
    }
}