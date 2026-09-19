class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    Node oddEven(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node odd = head;
        Node even = head.next;

        Node evenHead = even;

        while (even != null && even.next != null) {

      
            odd.next = even.next;
            odd = odd.next;

            
            even.next = odd.next;
            even = even.next;
        }

      
        odd.next = evenHead;

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

public class evenposition {

    public static void main(String[] args) {

        Add obj = new Add();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        System.out.println("Before:");
        obj.print(head);

        head = obj.oddEven(head);

        System.out.println("After:");
        obj.print(head);
    }
}