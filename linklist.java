import java.util.*;

class Node {
int vel;
Node next;
Node(int vel){
    this.vel = vel;
}
    
}
public class linklist {

    public static void print(Node head){
     Node temp = head;
     while (temp!=null){
        System.out.print(temp.vel+ " ");
        temp = temp.next;
     }
    }

    public static void main(String[] args) {
       Node a = new Node(10);
         Node b = new Node(10);
          Node c = new Node(10);
           Node d = new Node(10);
        Node e = new Node(10);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e; 
            print(a);
    }
}