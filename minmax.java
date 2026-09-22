// Definition for a singly-linked list node.
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

class Solution {
    public int[] nodesBetweenCriticalPoints(Node head) {
        // Initialize the answer array with default values [-1, -1]
        int[] ans = new int[]{-1, -1};
        
        // Base case: if list has fewer than 3 nodes, no critical points can exist
        if (head == null || head.next == null || head.next.next == null) {
            return ans;
        }

        // Initialize three consecutive pointers
        Node a = head;
        Node b = head.next;
        Node c = head.next.next;

        // Initialize tracking variables matching the snippet logic
        int firstIdx = -1;
        int lastIdx = -1;
        int minDist = Integer.MAX_VALUE;
        int idx = 1; // Tracks the position of node 'b'

        // --- START OF CODE FROM YOUR IMAGE ---
        if(c==null) return ans; // 2 size ki LL

        while(c!=null){
            // check for critical point
            if((b.val > a.val && b.val > c.val) || (b.val < a.val && b.val < c.val)){
                if(firstIdx==-1) firstIdx = idx;
                if(lastIdx!=-1){
                    int dist = idx - lastIdx;
                    minDist = Math.min(dist,minDist);
                }
                lastIdx = idx;
            }
            idx++;
            a = a.next;
            b = b.next;
            c = c.next;
        }
        int maxDist = lastIdx - firstIdx;
        if(maxDist==0) maxDist = -1;
        if(minDist==Integer.MAX_VALUE) minDist = -1;
        ans[0] = minDist;
        ans[1] = maxDist;
        return ans;
        // --- END OF CODE FROM YOUR IMAGE ---
    }
}

public class minmax {
    public static void main(String[] args) {
        // Constructing sample Linked List: 3 -> 1 -> 3 -> 4 -> 1 -> 2 -> 5.1
        // Critical points are at indices: 1 (val 1), 3 (val 4), 4 (val 1)
        Node head = new Node(3);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(2);

        Solution solver = new Solution();
        int[] result = solver.nodesBetweenCriticalPoints(head);

        System.out.println("Minimum Distance: " + result[0]);
        System.out.println("Maximum Distance: " + result[1]);
    }
}
