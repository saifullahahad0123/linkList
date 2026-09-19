class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    Node partition(Node head) {

        Node smallDummy = new Node(-1);
        Node largeDummy = new Node(-1);

        Node small = smallDummy;
        Node large = largeDummy;

        Node temp = head;

        while (temp != null) {

            if (temp.val%2 ==0) {
                small.next = temp;
                small = small.next;
            } 
            else {
                large.next = temp;
                large = large.next;
            }

            temp = temp.next;
        }

        // End the second list
        large.next = null;

        // Connect small list with large list
        small.next = largeDummy.next;

        return smallDummy.next;
    }

    void print(Node head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }
}

public class evenOdd {

    public static void main(String[] args) {

        Add obj = new Add();

        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        System.out.println("Before Even and odd:");
        obj.print(head);

        head = obj.partition(head);

        System.out.println("After Even and odd:");
        obj.print(head);
    }
}
