class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    Node merge(Node head1, Node head2) {

        
        Node dummy = new Node(-1);

        Node temp = dummy;

     
        while (head1 != null && head2 != null) {

            if (head1.val <= head2.val) {
                temp.next = head1;
                head1 = head1.next;
            } 
            else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

  
        if (head1 != null) {
            temp.next = head1;
        }

        if (head2 != null) {
            temp.next = head2;
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

public class merge {

    public static void main(String[] args) {

        Add obj = new Add();

     
        Node a = new Node(1);
        a.next = new Node(3);
        a.next.next = new Node(5);
        a.next.next.next = new Node(7);

     
        Node b = new Node(2);
        b.next = new Node(4);
        b.next.next = new Node(6);
        b.next.next.next = new Node(8);

        System.out.println("List 1:");
        obj.print(a);

        System.out.println("List 2:");
        obj.print(b);

        Node result = obj.merge(a, b);

        System.out.println("Merged List:");
        obj.print(result);
    }
}