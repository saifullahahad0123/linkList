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



    Node mergeSort(Node head) {

      
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node rightHead = slow.next;

        slow.next = null;

       
        Node left = mergeSort(head);

        
        Node right = mergeSort(rightHead);

        
        return merge(left, right);
    }


    void print(Node head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }
}


public class mergeSort {

    public static void main(String[] args) {

        Add obj = new Add();

        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(9);
          head.next.next.next.next.next.next = new Node(7);
        System.out.println("Before sorting:");

        obj.print(head);

        head = obj.mergeSort(head);

        System.out.println("After sorting:");

        obj.print(head);
    }
}
