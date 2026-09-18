

class Node {
int vel;
Node next;
Node(int vel){
    this.vel = vel;
}    
}
class add{
    void delete(Node head){
    int count = 0;
     Node temp = head;
     while (temp!=null){
        temp = temp.next;
        count++;
     }
     temp = head;
     for(int i = 1; i<=count/2-1;i++){
        temp = temp.next;
     }
     temp.next = temp.next.next;
        
}
void  print(Node head){
     Node temp = head;
     while (temp != null) {
        System.out.print( temp.vel + " ");
        temp = temp.next;
     }
System.out.println();
}
}
public class deletemiddle {
    

    public static void main(String[] args) {
        add saif = new add();
       Node a = new Node(10);
       Node b = new Node(10);
       Node c = new Node(22);
       Node d = new Node(10);
       Node e = new Node(10);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
             saif.print(a); 
            saif.delete(a);
            saif.print(a);
            
    }
}

