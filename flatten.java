import java.util.*;


class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node(int val) {
        this.val = val;
    }
}

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;
        
        Node curr = head;
        while (curr != null) {
            if (curr.child == null) {
                curr = curr.next;
            } else {
                Node fwd = curr.next;
                Node c = flatten(curr.child);
                
                curr.child = null;
                curr.next = c;
                c.prev = curr;
                
                Node temp = c;
                while (temp.next != null) {
                    temp = temp.next;
                }
                
                temp.next = fwd;
                
                if (fwd != null) {
                    fwd.prev = temp;
                }
                
                curr = fwd;
            }
        }
        return head;
    }
}

public class flatten {
    public static void main(String[] args) {
       
        
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);


        n1.next = n2; n2.prev = n1;
        n2.next = n3; n3.prev = n2;

        n3.child = n4;

        n4.next = n5; n5.prev = n4;

        System.out.println("Flattening the list...");
        Solution sol = new Solution();
        Node flattenedHead = sol.flatten(n1);

        System.out.print("Forward order:  ");
        Node curr = flattenedHead;
        Node last = null;
        while (curr != null) {
            System.out.print(curr.val + " ");
            last = curr;
            curr = curr.next;
        }
        System.out.println();

        System.out.print("Backward order: ");
        while (last != null) {
            System.out.print(last.val + " ");
            last = last.prev;
        }
        System.out.println();
    }
}