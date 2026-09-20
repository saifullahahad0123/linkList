class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    // Merge two sorted lists
    Node mergeTwo(Node a, Node b) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (a != null && b != null) {

            if (a.val <= b.val) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }

            temp = temp.next;
        }

        if (a != null) {
            temp.next = a;
        }

        if (b != null) {
            temp.next = b;
        }

        return dummy.next;
    }


    // Merge K sorted lists
    Node mergeK(Node[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        Node result = null;

        for (int i = 0; i < lists.length; i++) {
            result = mergeTwo(result, lists[i]);
        }

        return result;
    }


    void print(Node head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }
}


public class mergek {

    public static void main(String[] args) {

        Add obj = new Add();

        // List 1
        Node a = new Node(1);
        a.next = new Node(4);
        a.next.next = new Node(7);

        // List 2
        Node b = new Node(2);
        b.next = new Node(5);
        b.next.next = new Node(8);

        // List 3
        Node c = new Node(3);
        c.next = new Node(6);
        c.next.next = new Node(9);

        Node[] lists = {a, b, c};

        Node result = obj.mergeK(lists);

        obj.print(result);
    }
}
