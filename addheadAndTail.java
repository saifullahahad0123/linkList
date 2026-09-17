class Node {
int vel;
Node next;
Node(int vel){
    this.vel = vel;
}
    
}

class add{

    Node head;
    Node tail;
     void addAthead(int vel){
        Node temp = new Node(vel);
        if(head == null) head = tail = temp;
        else {
        temp.next = head;
         head = temp;
        }
    }
     void addAttail(int vel){
        Node temp = new Node(vel);
        if(tail == null) head = tail = temp;
        else {
        tail.next = temp;
         tail = temp;
        }
    }

     void print(){
    if (head == null ) return ;
     Node temp = head;

     while (temp!=null){
        System.out.print(temp.vel+ " ");
        temp = temp.next;
     }
     System.out.println();
    }
}


public class addheadAndTail{



       public static void main(String[] args) {

        add ll = new add();
        ll.addAttail(10);
         ll.addAttail(20);
          ll.addAttail(30);
          ll.print();
          ll.addAthead(30);
            ll.print();
            
           
    }
}