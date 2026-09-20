class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Add {

    Node addNumbers(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node temp = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

          
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

          
            int digit = sum % 10;

            
            carry = sum / 10;

            temp.next = new Node(digit);
            temp = temp.next;
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

public class addlinked {

    public static void main(String[] args) {

        Add obj = new Add();

        // 342
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        // 465
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node result = obj.addNumbers(l1, l2);

        obj.print(result);
    }
}