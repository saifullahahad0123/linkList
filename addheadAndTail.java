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

    void insert(int vel, int idx){
        if (idx<0 || idx > size){ System.out.print("invalid index");}
        else if(idx==0) addAthead(vel);
        else if (idx == size) addAttail(vel);
        else{
            Node temp = head;
            for(int i = 0; i<= idx-1; i++){
                temp = temp.next;
            }
            Node t = new Node(vel);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
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

    int get(int idx){
        Node temp = head;
        for (int i=0; i<idx;i++){
            temp = temp.next;
        }
        return temp.vel;
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

    void deleteIndex(int id){
        if(id<0 || id>size){
            System.out.print("Invalid index");

        }
        else if(id==0){
            delete();
            return ;
        }
        else{
         Node temp = head;
         for (int i = 0; i<id-1; i++){
            temp = temp.next;
         }
          temp.next = temp.next.next;
          if(id == size-1)
            tail = temp;
        size--;
    }}
}


public class addheadAndTail{
public static void main(String[] args) {

        addlinked ll = new addlinked();
        ll.addAttail(10);
         ll.addAttail(20);
          ll.addAttail(30);
          ll.print();
          ll.addAthead(30);
            ll.print();
        //    System.out.println(ll.size); 
        //   System.out.println( ll.find(200));
        ll.insert(80,1);
        ll.print();
        System.out.println(ll.get(3));
        ll.deleteIndex(2);
        ll.print();
           
    }
}