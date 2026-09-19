class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            // Store next node
            Node next = curr.next;

            // Reverse the link
            curr.next = prev;

            // Move prev forward
            prev = curr;

            // Move curr forward
            curr = next;
        }

        return prev;
    }

    void print(Node head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }
}

public class revarse{

    public static void main(String[] args) {

        Add obj = new Add();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Before:");
        obj.print(head);

        head = obj.reverse(head);

        System.out.println("After:");
        obj.print(head);
    }
}