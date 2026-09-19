class Node{
    int vel;
    Node next;
    Node(int vel){
        this.vel = vel;
    }   
}

class add{
    Node dup(Node head){
        Node dummy = new Node(-1);
        Node t = dummy;
        Node i = head;
        while (i!=null ) {
            if (i.next==null || i.vel != i.next.vel){
                t.next = i;
                t = i;
                i = t.next;
            }
            else{
                Node j = i.next;
                while (j != null && j.vel == i.vel) {
                    j = j.next;
                }
                i = j;
            }
            
        }
        t.next = i;
        return dummy.next;
    }

    void print(Node head){
    if (head == null ) return ;
     Node temp = head;

     while (temp!=null){
        System.out.print(temp.vel+ " ");
        temp = temp.next;
     }
     System.out.println();
    }

}

public class removeduplicates {
    public static void main(String[] args) {
        add add = new add();
       Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(20);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        add.print(a);
        add.dup(a);
        add.print(a);
    }
    
}
