class Node {
    int data;
    Node next;
    Node back;
    public Node child;
    Node(){}

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back=null;
    }

    Node(int data, Node next,Node back,Node child) {
        this.data = data;
        this.next = next;
        this.back=back;
        this.child=child;
    }
}
public class FllatenaDoubleLL {
    public Node flatten(Node head){
        if(head==null) return null;

        Node dummy=new Node();
        dummy.next=head;
        preorder(dummy,head);
        dummy.next.back=null;
        return dummy.next;


    }
    private Node preorder(Node prev,Node cur){
        if(cur==null) return prev;
        cur.back=prev;
        prev.next=cur;
        Node t=cur.next;
        Node tail=preorder(cur, cur.child);
        cur.child=null;
        return preorder(tail, t);
    }
    
}
