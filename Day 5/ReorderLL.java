
class Node {
    int data;
    Node next;
    Node(){}

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class ReorderLL {
    public void reorderList(Node head) {
        Node fast=head; Node slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=null;
        Node cur=slow.next;
        slow.next=null;
        while(cur!=null){
            Node front=cur.next;
            cur.next=prev;
            prev=cur;
            cur=front;

        }
        cur=head;
        while(prev!=null){
            Node temp=prev.next;
            prev.next=cur.next;
            cur.next=prev;
            cur=prev.next;
            prev=temp;


        }

    }
    
}
