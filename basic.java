
 class DNode {
 int val;
 DNode next;
 DNode prve;
 DNode (int val) {
    this.val = val;
}};

class Add{
    DNode head;
    DNode tail;
    int  count;
    void  addAtHead(int val){
    DNode temp = new DNode(val) ;
    if (head == null) head = tail = temp;  
    else {
        temp.next = head;
        head.prve = temp;
        temp = head;
    }
    }

     void  addAttail(int val){
    DNode temp = new DNode(val) ;
    if (head == null) head = tail = temp;  
    else {
        temp.next = temp;
        head.prve = tail;
        temp = head;
    }
    }
}


public class basic {

public static void main(String[] args) {
    
Add a = new Add();
a.addAtHead(55);

}
    
}