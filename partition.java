class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    Node partition(Node head, int x) {

       
        Node smallDummy = new Node(-1);

     
        Node largeDummy = new Node(-1);

        Node small = smallDummy;
        Node large = largeDummy;

        Node temp = head;

        while (temp != null) {

            if (temp.val < x) {
                small.next = temp;
                small = small.next;
            } 
            else {
                large.next = temp;
                large = large.next;
            }

            temp = temp.next;
        }

   
        large.next = null;

      
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

public class partition {

    public static void main(String[] args) {

        Add obj = new Add();

        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        System.out.println("Before partition:");
        obj.print(head);

        head = obj.partition(head, 3);

        System.out.println("After partition:");
        obj.print(head);
    }
}
