class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class IntersectionofTwoLL {
    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA==null || headB==null) return null;
        Node t1=headA; Node t2=headB;
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
            if(t1==t2) return t1;
            if(t1==null) t1=headB;
            if(t2==null) t2=headA;
        }
        return t1;
        
    }
    
}
