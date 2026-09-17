class Node {
int vel;
Node next;
Node(int vel){
    this.vel = vel;
}
    
}
public class getElement{

    public static void print(Node head){
     Node temp = head;
     while (temp!=null){
        System.out.print(temp.vel+ " ");
        temp = temp.next;
     }
    }

    public static int get(Node head, int idx){
       Node temp = head;
       for(int i = 0; i<=idx; i++){
        temp = temp.next;
       }
       return temp.vel;
    }

    public static void main(String[] args) {
       Node a = new Node(1);
         Node b = new Node(2);
          Node c = new Node(3);
           Node d = new Node(4);
        Node e = new Node(5);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e; 
           System.out.print(get(a, 2)); 
    }
}