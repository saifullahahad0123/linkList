class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    Node intersection(Node head1, Node head2) {

        int len1 = 0;
        int len2 = 0;

        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }

       
        while (temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }

      
        Node p1 = head1;
        Node p2 = head2;

        if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++) {
                p1 = p1.next;
            }
        } else {
            for (int i = 0; i < len2 - len1; i++) {
                p2 = p2.next;
            }
        }

       
        while (p1 != p2) {

            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }
}

public class intersection {

    public static void main(String[] args) {

        Add saif = new Add();

        Node common1 = new Node(30);
        Node common2 = new Node(40);
        Node common3 = new Node(50);

        common1.next = common2;
        common2.next = common3;


        Node a = new Node(10);
        Node b = new Node(20);

        a.next = b;
        b.next = common1;

       
        Node c = new Node(15);
        Node d = new Node(25);

        c.next = d;
        d.next = common1;

        Node result = saif.intersection(a, c);

        if (result != null) {
            System.out.println("Intersection = " + result.val);
        } else {
            System.out.println("No intersection");
        }
    }
}
