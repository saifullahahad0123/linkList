class DNode {

    int val;
    DNode next;
    DNode prve;

    DNode(int val) {
        this.val = val;
    }
}

class Add {

    DNode head;
    DNode tail;
    int count;

    // Add at head
    void addAtHead(int val) {

        DNode temp = new DNode(val);

        if (head == null) {
            head = tail = temp;
        } 
        else {
            temp.next = head;
            head.prve = temp;
            head = temp;
        }

        count++;
    }

    // Add at tail
    void addAtTail(int val) {

        DNode temp = new DNode(val);

        if (head == null) {
            head = tail = temp;
        } 
        else {
            tail.next = temp;
            temp.prve = tail;
            tail = temp;
        }

        count++;
    }

    // Print from head
    void print() {

        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class basic {

    public static void main(String[] args) {

        Add a = new Add();

        a.addAtHead(55);
        a.addAtHead(2);
        a.addAtHead(5);
        a.addAtHead(45);
        a.addAtHead(65);

        a.print();

        a.addAtTail(100);
        a.addAtTail(200);

        a.print();
    }
}