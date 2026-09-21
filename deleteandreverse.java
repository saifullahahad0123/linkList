class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class deleteandreverse {

    Node head;

    void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    void delete(int value) {

        if (head == null) {
            return;
        }

       
        if (head.next == head) {

            if (head.data == value) {
                head = null;
            }

            return;
        }

        if (head.data == value) {

            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            head = head.next;
            temp.next = head;

            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != head) {

            if (curr.data == value) {
                prev.next = curr.next;
                return;
            }

            prev = curr;
            curr = curr.next;
        }
    }

    void reverse() {

        if (head == null || head.next == head) {
            return;
        }

        Node prev = null;
        Node curr = head;
        Node next;

        do {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;

        } while (curr != head);

        head.next = prev;
        head = prev;
    }

    void print() {

        if (head == null) {
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;

        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {

    deleteandreverse list = new deleteandreverse();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original:");
        list.print();

        list.delete(30);

        System.out.println("After delete:");
        list.print();

        list.reverse();

        System.out.println("After reverse:");
        list.print();
    }
}