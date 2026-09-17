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
    int size;

    int find(int vel){
        if (head == null) return -1;
        Node temp = head;
        while (temp!=null) {
            if (temp.vel == vel) return 1;
           temp = temp.next;
        } 
        return -1;

    }

     void addAthead(int vel){
        Node temp = new Node(vel);
        if(head == null) head = tail = temp;
        else {
        temp.next = head;
         head = temp;
        }
        size++;
    }
     void addAttail(int vel){
        Node temp = new Node(vel);
        if(tail == null) head = tail = temp;
        else {
        tail.next = temp;
         tail = temp;
        }
        size++;
    }

    void delete(){
        if (head == null ){
            System.out.println("node is empty");
            return ;
        }
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
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
           System.out.println(ll.size); 
          System.err.println( ll.find(200));
           
    }
}