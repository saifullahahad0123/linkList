class DNode {

    int val;
    DNode next;
    DNode prev;

    DNode(int val) {
        this.val = val;
    }
}

class Add {

    DNode head;
    DNode tail;

    void addAtHead(int val) {

        DNode temp = new DNode(val);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    void addAtTail(int val) {

        DNode temp = new DNode(val);

        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    void reverse() {

        DNode curr = head;
        DNode temp = null;

        while (curr != null) {

            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }

    void print() {

        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class reversedouble{

    public static void main(String[] args) {

        Add a = new Add();

        a.addAtTail(10);
        a.addAtTail(20);
        a.addAtTail(30);
        a.addAtTail(40);

        System.out.println("Before reverse:");
        a.print();

        a.reverse();

        System.out.println("After reverse:");
        a.print();
    }
}